package com.di.campusmarket.services;

import com.di.campusmarket.dtos.ReporteDTO;
import com.di.campusmarket.models.Reporte;

import java.util.List;

public interface ReporteService {
    ReporteDTO createReporte(Reporte reporte);
    void deleteReporte(Reporte reporte);
    List<ReporteDTO> getAllByUsuarioId(Long idUsuario);
    List<ReporteDTO> getAllByPublicacionId(Long idPublicacion);

}
