package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    Calificacion findByPublicacionIdPublicacion(Long idPublicacion);
    List<Calificacion> findByValor(int valor);
}
