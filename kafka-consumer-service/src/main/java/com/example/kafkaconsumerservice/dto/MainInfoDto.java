package com.example.kafkaconsumerservice.dto;

import lombok.Data;

@Data
public class MainInfoDto {
	private String reason;
	private OriginalDocInfoDto originalDocInfo;
	private ParticipantInfoDto participantInfo;
}