package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.FileDto;
import com.example.kafkaconsumerservice.enitity.File;
import org.mapstruct.Mapper;

@Mapper(uses = DocumentMapper.class)
public interface FileMapper extends EntityMapper<File, FileDto> {

    @Override
    FileDto convertFromEntityToDto(File entity);

    @Override
    File convertFromDtoToEntity(FileDto dto);
}
