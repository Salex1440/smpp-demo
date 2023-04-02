package com.example.smppdemo.handler;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class SmppHandler {

    public void receive(Exchange exchange) {
        if (exchange.getException() == null) {
            Message message = exchange.getIn();
            System.out.println("Received id " + message.getHeader("CamelSmppId"));
            System.out.println("Text :- " + message.getBody());
            System.out.println("Total delivered " + message.getHeader("CamelSmppDelivered"));
            System.out.println("Message status " + message.getHeader("CamelSmppStatus"));
            System.out.println("Submitted date " + message.getHeader("CamelSmppSubmitDate", Date.class));
            System.out.println("Done date " + message.getHeader("CamelSmppDoneDate", Date.class));
        } else {
            System.out.println(exchange.getException());
        }
    }

}
