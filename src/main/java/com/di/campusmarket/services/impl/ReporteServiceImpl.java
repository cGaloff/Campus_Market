package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.ReporteDTO;
import com.di.campusmarket.mappers.ReporteMapper;
import com.di.campusmarket.models.Reporte;
import com.di.campusmarket.repositories.ReporteRepository;
import com.di.campusmarket.services.ReporteService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ReporteServiceImpl implements ReporteService {

    private final ReporteRepository reporteRepository;
    private final ReporteMapper reporteMapper;

    @Override
    public ReporteDTO createReporte(Reporte reporte) {
        return null;
    }

    @Override
    public void deleteReporte(Reporte reporte) {

    }

    @Override
    public List<ReporteDTO> getAllByUsuarioId(Long idUsuario) {
        return List.of();
    }

    @Override
    public List<ReporteDTO> getAllByPublicacionId(Long idPublicacion) {
        return List.of();
    }
}
