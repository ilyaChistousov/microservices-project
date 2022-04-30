package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.DocumentDto;
import com.example.kafkaconsumerservice.enitity.Document;
import org.mapstruct.Mapper;

@Mapper(uses = {MainInfoMapper.class, ProductListMapper.class})
public interface DocumentMapper extends EntityMapper<Document, DocumentDto> {
    @Override
    DocumentDto convertFromEntityToDto(Document entity);

    @Override
    Document convertFromDtoToEntity(DocumentDto dto);
}
