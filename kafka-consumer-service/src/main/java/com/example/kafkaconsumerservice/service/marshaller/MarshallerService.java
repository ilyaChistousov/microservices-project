package com.example.kafkaconsumerservice.service.marshaller;

public interface MarshallerService<E>{

    E unmarshall(String xml);
}
