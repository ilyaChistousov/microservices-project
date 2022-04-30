package com.example.converterservice.service;

import com.example.converterservice.feign.FeignSenderXMLClient;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SenderService {

    private final FeignSenderXMLClient feignSenderXMLClient;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendXML(String xml) {
        feignSenderXMLClient.sendXml(xml);
    }
}
