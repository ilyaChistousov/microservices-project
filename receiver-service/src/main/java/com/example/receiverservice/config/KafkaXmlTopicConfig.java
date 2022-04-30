package com.example.receiverservice.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaXmlTopicConfig {

    @Bean
    public NewTopic xmlTopic() {
        return TopicBuilder.name("xmlTopic")
                .build();
    }
}