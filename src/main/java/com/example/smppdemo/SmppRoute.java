package com.example.smppdemo;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SmppRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("smpp://smppclient@localhost:2775?password=password&enquireLinkTimer=3000&transactionTimer=5000&systemType=consumer")
                .routeId("Smpp route")
                    .log("${body}")
                .to("log:?showBody=true");
//                .bean(new SmppHandler(), "receive");
    }
}
