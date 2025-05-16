package com.di.campusmarket.services;


import com.di.campusmarket.dtos.CalificacionDTO;
import com.di.campusmarket.models.Calificacion;

import java.util.List;

public interface CalificacionService {
    CalificacionDTO createCalificacion(Calificacion calificacion);
    List<CalificacionDTO> getAllCalificaciones();
    CalificacionDTO getCalificacionByPublicacionId(Long id);
}
