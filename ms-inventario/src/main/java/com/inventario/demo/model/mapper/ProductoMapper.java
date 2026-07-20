package com.inventario.demo.model.mapper;

import com.inventario.demo.model.dto.ProductoRequest;
import com.inventario.demo.model.dto.ProductoResponse;
import com.inventario.demo.model.entity.ProductoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductoMapper {
    ProductoMapper MAPPER = Mappers.getMapper(ProductoMapper.class);
    ProductoResponse toProductoResponse(ProductoEntity entity);
    ProductoEntity toProductoEntity(ProductoRequest request);
}