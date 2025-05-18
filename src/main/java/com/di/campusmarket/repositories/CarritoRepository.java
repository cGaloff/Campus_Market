package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {
    Carrito findByUsuarioIdUsuario(Long idUsuario);
    Optional<Carrito> findByPublicacionIdPublicacion(Long idPublicacion);
}
