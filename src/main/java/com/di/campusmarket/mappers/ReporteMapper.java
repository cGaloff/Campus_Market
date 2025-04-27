package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.ReporteDTO;
import com.di.campusmarket.models.Reporte;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReporteMapper {
    ReporteDTO toDTO(ReporteDTO reporte);
    Reporte toEntity(ReporteDTO reporteDTO);
}
