package com.tatipati.kafkaboot.service;

/**
 * @author Mahdi Sharifi
 * @version 2022.1.1
 * https://www.linkedin.com/in/mahdisharifi/
 * @since 1/12/2022
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class Producer {

    private final java.util.logging.Logger logger = Logger.getLogger("Producer");
    private static final String TOPIC = "sample_topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        this.kafkaTemplate.send(TOPIC, message);
        logger.info("#Published message: "+message);

    }
}