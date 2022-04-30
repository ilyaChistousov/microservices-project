package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.MainInfoDto;
import com.example.kafkaconsumerservice.enitity.MainInfo;
import org.mapstruct.Mapper;

@Mapper(uses = {OriginalDocInfoMapper.class, ParticipantInfoMapper.class})
public interface MainInfoMapper extends EntityMapper<MainInfo, MainInfoDto> {
    @Override
    MainInfoDto convertFromEntityToDto(MainInfo entity);

    @Override
    MainInfo convertFromDtoToEntity(MainInfoDto dto);
}
