package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.ICodeItemDto;
import com.example.kafkaconsumerservice.enitity.ICodeItem;
import org.mapstruct.Mapper;

@Mapper
public interface ICodeItemMapper extends EntityMapper<ICodeItem, ICodeItemDto> {
    @Override
    ICodeItemDto convertFromEntityToDto(ICodeItem entity);

    @Override
    ICodeItem convertFromDtoToEntity(ICodeItemDto dto);
}
