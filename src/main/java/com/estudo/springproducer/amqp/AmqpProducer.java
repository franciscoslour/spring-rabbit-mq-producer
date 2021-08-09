package com.estudo.springproducer.amqp;

public interface AmqpProducer<T> {

    void producer(T t);

}
