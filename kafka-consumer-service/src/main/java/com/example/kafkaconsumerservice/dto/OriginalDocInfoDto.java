package com.example.kafkaconsumerservice.dto;

import lombok.Data;

@Data
public class OriginalDocInfoDto {
	private String docName;
	private String docNumber;
	private String docDate;
}