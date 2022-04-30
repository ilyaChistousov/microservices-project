package com.example.kafkaconsumerservice.mapper.mapstruct;

public interface EntityMapper <E, D> {

    D convertFromEntityToDto(E entity);
    E convertFromDtoToEntity(D dto);
}
