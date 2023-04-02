package com.example.smppdemo.router;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class SmppRouter extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("smpp://{{camel.component.smpp.configuration.host}}")
                .to("bean:smppHandler?method=receive");

    }

}
