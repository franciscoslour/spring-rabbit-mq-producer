package com.estudo.springproducer.amqp.impl;

import com.estudo.springproducer.amqp.AmqpProducer;
import com.estudo.springproducer.dto.EmailModelDto;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProducerRabbitMQ implements AmqpProducer<EmailModelDto> {

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Value("${spring.rabbitmq.queue}")
    private String queue;

    @Override
    public void producer(EmailModelDto emailModelDto) {
        try{
            this.rabbitTemplate.convertAndSend(queue,emailModelDto);
        }catch (Exception ex){
            throw new AmqpRejectAndDontRequeueException(ex);
        }
    }
}
