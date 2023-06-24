package com.mnr.springbootkafka.kafka;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


//FOR SENDING A MESSAGE IN FORMAT STRING
@Service
public class kafkaConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaConsumer.class);

    //subscribe or listen to a topic
    @KafkaListener(topics="mailTracking",groupId = "myGroup")
    public void consume(String message){
        //print to console this message
        LOGGER.info(String.format("message received -> %s", message));

    }
}
