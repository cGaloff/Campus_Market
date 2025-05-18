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
    public ReporteDTO createReporte(ReporteDTO reporte) {
        Reporte reporteEntity = reporteMapper.toEntity(reporte);
        return reporteMapper.toDTO(reporteRepository.save(reporteEntity));
    }

    @Override
    public void deleteReporte(ReporteDTO reporte) {
        reporteRepository.deleteById(reporte.getIdReporte());
    }

    @Override
    public List<ReporteDTO> getAllByUsuarioId(Long idUsuario) {
        List<Reporte> reportes = reporteRepository.findByUsuarioIdUsuario(idUsuario);
        return reporteMapper.toDTO(reportes);
    }

    @Override
    public List<ReporteDTO> getAllByPublicacionId(Long idPublicacion) {
        List<Reporte> reportes = reporteRepository.findByPublicacionIdPublicacion(idPublicacion);
        return reporteMapper.toDTO(reportes);
    }
}
