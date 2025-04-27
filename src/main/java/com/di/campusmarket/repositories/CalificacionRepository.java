package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    Calificacion findByUsuarioIdAndPublicacionId(Long usuarioId, Long publicacionId);
    Calificacion findByPublicacionId(Long publicacionId);
    List<Calificacion> findByUsuarioId(Long usuarioId);
    List<Calificacion> findByValor(int valor);
}
