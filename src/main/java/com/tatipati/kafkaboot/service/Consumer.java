package com.tatipati.kafkaboot.service;

/**
 * @author Mahdi Sharifi
 * @version 2022.1.1
 * https://www.linkedin.com/in/mahdisharifi/
 * @since 1/12/2022
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(com.tatipati.kafkaboot.service.Consumer.class);

    @KafkaListener(topics = "sample_topic", groupId = "group_id")
    public void consume(String message) {
        logger.info("#Consume message: "+message);

    }
}