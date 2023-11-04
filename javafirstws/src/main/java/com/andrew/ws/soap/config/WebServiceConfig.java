package com.andrew.ws.soap.config;

import com.andrew.ws.soap.PaymentProcessorImpl;
import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.feature.Features;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class WebServiceConfig {
    @Autowired
    private Bus bus;
    @Bean
    public Endpoint endpoint() {
        Endpoint endpoint = new EndpointImpl(bus, new PaymentProcessorImpl());
        endpoint.publish("/paymentProcessor");
        return endpoint;
    }
}
