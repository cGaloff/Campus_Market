package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.MensajeDTO;
import com.di.campusmarket.models.Mensaje;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MensajeMapper {
    MensajeDTO toDTO(MensajeDTO mensajeDTO);
    Mensaje toEntity(MensajeDTO mensajeDTO);
}
