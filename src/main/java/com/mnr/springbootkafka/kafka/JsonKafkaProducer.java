package com.mnr.springbootkafka.kafka;

import com.mnr.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;


//FOR SENDING A MESSAGE IN FORMAT JSON
@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    //we use value of type User
    private KafkaTemplate<String ,User> kafkaTemplate;

    public JsonKafkaProducer(KafkaTemplate<String, User> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(User data){

        LOGGER.info(String.format("Message sent -> %s",data.toString()));

        //create a message object
        Message<User> message= MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC, "mailTracking-json")
                .build();

        //send message
        kafkaTemplate.send(message);
    }
}
