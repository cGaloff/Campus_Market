package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Publicacion;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublicacionRepository extends JpaRepository<Publicacion, Long> {
    Publicacion findByTitulo(String titulo);
    List<Publicacion> findByEmprendimientoUsuarioIdUsuario(Long idUsuario);
    List<Publicacion> findByCategoriaIdCategoria(Long idCategoria);
    List<Publicacion> findByEmprendimientoIdEmprendimiento(Long idEmprendimiento);


}
