package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    Publicacion findByTitulo(String titulo);
    List<Publicacion> findByUsuario(Long usuario);

    List<Publicacion> findByCategoria(Long categoria);
    List<Publicacion>findByEmprendimientoId(Long emprendimientoId);

}
