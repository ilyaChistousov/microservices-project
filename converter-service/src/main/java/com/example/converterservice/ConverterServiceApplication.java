package com.example.converterservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class ConverterServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConverterServiceApplication.class, args);
    }

}
