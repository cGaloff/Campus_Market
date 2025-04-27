package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.PublicacionDTO;
import com.di.campusmarket.models.Publicacion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PublicacionMapper {
    PublicacionDTO toDTO(Publicacion publicacion);
    Publicacion toEntity(PublicacionDTO publicacionDTO);
}
