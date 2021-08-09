package com.estudo.springproducer.service;

import com.estudo.springproducer.dto.EmailModelDto;

public interface AmqpService<T> {

    void sendToConsumer(EmailModelDto emailModelDto);
}
