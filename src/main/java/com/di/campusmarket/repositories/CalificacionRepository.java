package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Calificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CalificacionRepository extends JpaRepository<Calificacion, Long> {
    Optional<Calificacion> findByPublicacionIdPublicacion(Long idPublicacion);
    List<Calificacion> findByValor(int valor);
}
