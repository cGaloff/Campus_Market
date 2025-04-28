package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Reporte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReporteRepository extends JpaRepository<Reporte, Long> {
    List<Reporte> findByUsuarioIdUsuario(Long idUsuario);
    List<Reporte> findByPublicacionIdPublicacion(Long idPublicacion);

}
