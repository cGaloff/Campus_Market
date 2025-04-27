package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.CalificacionDTO;
import com.di.campusmarket.models.Calificacion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CalificacionMapper {
    CalificacionDTO toDTO(Calificacion calificacion);
    Calificacion toEntity(CalificacionDTO calificacionDTO);
}
