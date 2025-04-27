package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.ProductoDTO;
import com.di.campusmarket.models.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {
    ProductoDTO toDTO(Producto producto);
    Producto toEntity(ProductoDTO productoDTO);
}
