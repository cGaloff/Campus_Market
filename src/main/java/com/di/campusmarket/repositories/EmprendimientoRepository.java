package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Emprendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {
    Emprendimiento findByNombre(String nombre);
    Emprendimiento findByUsuarioId(Long usuarioId);
    Emprendimiento findByPublicacionId(Long publicacionId);
}
