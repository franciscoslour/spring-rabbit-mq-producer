package com.estudo.springproducer.controller;

import com.estudo.springproducer.dto.EmailModelDto;
import com.estudo.springproducer.service.impl.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {


    @Autowired
    private RabbitMQService rabbitMQService;


    @RequestMapping("/send")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void sendEmail(@RequestBody EmailModelDto emailModelDto){
        this.rabbitMQService.sendToConsumer(emailModelDto);
    }

}
