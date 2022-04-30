package com.example.kafkaconsumerservice.mapper.mapstruct;

import com.example.kafkaconsumerservice.dto.ProductListDto;
import com.example.kafkaconsumerservice.enitity.ProductList;
import org.mapstruct.Mapper;

@Mapper(uses = ICodeItemMapper.class)
public interface ProductListMapper extends EntityMapper<ProductList, ProductListDto> {
    @Override
    ProductListDto convertFromEntityToDto(ProductList entity);

    @Override
    ProductList convertFromDtoToEntity(ProductListDto dto);
}
