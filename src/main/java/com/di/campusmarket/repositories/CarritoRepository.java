package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Carrito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoRepository extends JpaRepository<Carrito, Long> {
    Carrito findByUsuarioId(Long usuarioId);
    Carrito findByPublicacionId(Long publicacionId);

}
