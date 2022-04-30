package com.example.kafkaconsumerservice.service.kafka;

import com.example.kafkaconsumerservice.repository.FileRepository;
import com.example.kafkaconsumerservice.service.marshaller.MarshallerService;
import com.example.kafkaconsumerservice.enitity.File;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaXmlListener {

    private final FileRepository fileRepository;
    private final MarshallerService<File> marshaller;

    @KafkaListener(topics = "xmlTopic", groupId = "xmlConsumer")
    public void saveInDb(String xmlData) {
        File file = marshaller.unmarshall(xmlData);
        fileRepository.save(file);
    }
}