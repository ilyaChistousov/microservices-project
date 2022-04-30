package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.ParticipantInfoDto;
import com.example.kafkaconsumerservice.enitity.ParticipantInfo;
import org.mapstruct.Mapper;

@Mapper
public interface ParticipantInfoMapper extends EntityMapper<ParticipantInfo, ParticipantInfoDto> {
    @Override
    ParticipantInfoDto convertFromEntityToDto(ParticipantInfo entity);

    @Override
    ParticipantInfo convertFromDtoToEntity(ParticipantInfoDto dto);
}
