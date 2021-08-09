package com.estudo.springproducer.service.impl;

import com.estudo.springproducer.amqp.AmqpProducer;
import com.estudo.springproducer.dto.EmailModelDto;
import com.estudo.springproducer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService implements AmqpService<EmailModelDto> {

    @Autowired
    private AmqpProducer<EmailModelDto> amqpProducer;

    @Override
    public void sendToConsumer(EmailModelDto emailModelDto) {
        this.amqpProducer.producer(emailModelDto);
    }
}
