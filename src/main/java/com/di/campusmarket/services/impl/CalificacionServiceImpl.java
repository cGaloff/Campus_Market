package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.CalificacionDTO;
import com.di.campusmarket.mappers.CalificacionMapper;
import com.di.campusmarket.models.Calificacion;
import com.di.campusmarket.repositories.CalificacionRepository;
import com.di.campusmarket.services.CalificacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CalificacionServiceImpl implements CalificacionService {
    private final CalificacionRepository calificacionRepository;
    private final CalificacionMapper calificacionMapper;

    @Override
    public CalificacionDTO createCalificacion(Calificacion calificacion) {
        return null;
    }

    @Override
    public List<CalificacionDTO> getAllCalificaciones() {
        return List.of();
    }

    @Override
    public CalificacionDTO getCalificacionByPublicacionId(Long id) {
        return null;
    }
}
