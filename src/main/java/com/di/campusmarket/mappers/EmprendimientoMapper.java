package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.EmprendimientoDTO;
import com.di.campusmarket.models.Emprendimiento;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmprendimientoMapper {
    EmprendimientoDTO toDTO(Emprendimiento emprendimiento);
    Emprendimiento toEntity(EmprendimientoDTO emprendimientoDTO);
}
