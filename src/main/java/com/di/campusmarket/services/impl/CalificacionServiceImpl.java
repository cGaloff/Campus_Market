package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.CalificacionDTO;
import com.di.campusmarket.mappers.CalificacionMapper;
import com.di.campusmarket.models.Calificacion;
import com.di.campusmarket.repositories.CalificacionRepository;
import com.di.campusmarket.services.CalificacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CalificacionServiceImpl implements CalificacionService {
    private final CalificacionRepository calificacionRepository;
    private final CalificacionMapper calificacionMapper;

    @Override
    public CalificacionDTO createCalificacion(CalificacionDTO calificacion) {
        Calificacion calificacionEntity = calificacionMapper.toEntity(calificacion);
        return calificacionMapper.toDTO(calificacionRepository.save(calificacionEntity));
    }

    @Override
    public List<CalificacionDTO> getAllCalificaciones() {
        return calificacionRepository.findAll().stream().map(calificacionMapper::toDTO).toList();
    }

    @Override
    public Optional<CalificacionDTO> getCalificacionByPublicacionId(Long id) {

        return calificacionRepository.findByPublicacionIdPublicacion(id).map(calificacionMapper::toDTO);
    }
}
