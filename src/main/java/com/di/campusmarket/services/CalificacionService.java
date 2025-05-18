package com.di.campusmarket.services;


import com.di.campusmarket.dtos.CalificacionDTO;
import com.di.campusmarket.models.Calificacion;

import java.util.List;
import java.util.Optional;

public interface CalificacionService {
    CalificacionDTO createCalificacion(CalificacionDTO calificacion);
    List<CalificacionDTO> getAllCalificaciones();
    Optional<CalificacionDTO> getCalificacionByPublicacionId(Long id);
}
