package com.mnr.springbootkafka.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


//FOR SENDING A MESSAGE IN FORMAT STRING
@Service
public class KafkaProducer {

    //create a logger instance
    private static final Logger LOGGER= LoggerFactory.getLogger(KafkaProducer.class);

    //spring boot will provide auto-configuratio for KafkaTemplate
    private KafkaTemplate<String,String> kafkaTemplate;


    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    //send message
    public void sendMessage(String message){
        //LOGGER.info(String.format("Message sent %s",message));
        kafkaTemplate.send("mailTracking",message);
    }


}
