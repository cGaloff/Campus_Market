package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.CarritoDTO;
import com.di.campusmarket.models.Carrito;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CarritoMapper {
    CarritoDTO toDTO(Carrito carrito);
    Carrito toEntity(CarritoDTO carritoDTO);
}
