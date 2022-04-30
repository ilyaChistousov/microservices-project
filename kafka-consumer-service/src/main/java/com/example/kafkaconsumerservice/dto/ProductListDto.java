package com.example.kafkaconsumerservice.dto;

import lombok.Data;
import java.util.List;

@Data
public class ProductListDto {

	private List<ICodeItemDto> iCodeItemDto;
}