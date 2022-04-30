package com.example.receiverservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/send")
@RequiredArgsConstructor
public class ReceiverXmlController {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/xml")
    public void getXml(@RequestBody String xml) {
        kafkaTemplate.send("xmlTopic", xml);
        System.out.println(xml);
    }
}

