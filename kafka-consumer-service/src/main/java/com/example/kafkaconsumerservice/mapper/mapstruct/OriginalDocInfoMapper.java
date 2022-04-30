package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.OriginalDocInfoDto;
import com.example.kafkaconsumerservice.enitity.OriginalDocInfo;
import org.mapstruct.Mapper;

@Mapper
public interface OriginalDocInfoMapper extends EntityMapper<OriginalDocInfo, OriginalDocInfoDto> {
    @Override
    OriginalDocInfoDto convertFromEntityToDto(OriginalDocInfo entity);

    @Override
    OriginalDocInfo convertFromDtoToEntity(OriginalDocInfoDto dto);
}
