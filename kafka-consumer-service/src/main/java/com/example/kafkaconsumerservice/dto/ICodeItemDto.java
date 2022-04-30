package com.example.kafkaconsumerservice.dto;

import lombok.Data;

@Data
public class ICodeItemDto {
	private String count;
	private String text;
	private ProductListDto productListDto;
}