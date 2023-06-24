package com.mnr.springbootkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class kafkaTopicConfig {

    //create kafka topic in kafka cluster
    //for message in type String
    @Bean
    public NewTopic mailTrackingTopic(){
        return TopicBuilder.name("mailTracking")
                .build();
    }

    //for message in type JSON
    @Bean
    public NewTopic mailTrackingJsonTopic(){
        return TopicBuilder.name("mailTracking-json")
                .build();
    }
}
