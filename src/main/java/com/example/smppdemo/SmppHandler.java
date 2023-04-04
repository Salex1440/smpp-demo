package com.example.smppdemo;

import org.apache.camel.Exchange;
import org.springframework.stereotype.Component;

@Component
public class SmppHandler {

    public void receive(Exchange exchange) {
        System.out.println(exchange.getIn().toString());
        System.out.println(exchange.getIn().getHeaders().toString());
    }
}
