package com.example.kafkaconsumerservice.dto;

import lombok.Data;

@Data
public class DocumentDto {
	private MainInfoDto mainInfo;
	private ProductListDto productList;
}