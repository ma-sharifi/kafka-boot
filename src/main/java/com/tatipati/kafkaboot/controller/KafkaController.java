package com.tatipati.kafkaboot.controller;

import com.tatipati.kafkaboot.service.Producer;
import org.springframework.web.bind.annotation.*;

/**
 * @author Mahdi Sharifi
 * @version 2022.1.1
 * https://www.linkedin.com/in/mahdisharifi/
 * @since 1/12/2022
 */

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

    private final Producer producer;

    public KafkaController(Producer producer) {
        this.producer = producer;
    }

    @GetMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam String message) {
        this.producer.sendMessage(message);
    }
}