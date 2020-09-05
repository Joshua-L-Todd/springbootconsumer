package com.learning.consumer.springconsumer;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.learning.producer.springproducer.model.Organization;

@Component
public class OrganizationConsumer {
    @JmsListener(destination = "${activemq.destination}", containerFactory = "jmsFactory")
    public void processToDo(Organization org) {
        System.out.println("Consumer> " + org.toString());
    }
}
