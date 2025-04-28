package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Emprendimiento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmprendimientoRepository extends JpaRepository<Emprendimiento, Long> {
    Emprendimiento findByNombre(String nombre);
    Emprendimiento findByUsuarioIdUsuario(Long idUsuario);
    @Query("SELECT e FROM Emprendimiento e JOIN e.publicaciones p WHERE p.idPublicacion = :idPublicacion")
    Emprendimiento findByIdPublicacion(@Param("idPublicacion") Long idPublicacion);
}
