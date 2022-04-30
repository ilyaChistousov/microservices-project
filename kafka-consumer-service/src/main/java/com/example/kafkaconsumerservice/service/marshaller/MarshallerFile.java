package com.example.kafkaconsumerservice.service.marshaller;

import com.example.kafkaconsumerservice.enitity.*;
import com.example.kafkaconsumerservice.service.marshaller.MarshallerService;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

@Service
@RequiredArgsConstructor
public class MarshallerFile implements MarshallerService<File> {

    @SneakyThrows(JAXBException.class)
    public File unmarshall(String xml) {
        JAXBContext context = JAXBContext.newInstance(File.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (File) unmarshaller.unmarshal(new StringReader(xml));
    }
}
