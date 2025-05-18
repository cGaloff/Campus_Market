package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.ReporteDTO;
import com.di.campusmarket.models.Reporte;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReporteMapper {
    ReporteDTO toDTO(Reporte reporte);
    Reporte toEntity(ReporteDTO reporteDTO);
    List<ReporteDTO> toDTO(List<Reporte> reportes);
}
