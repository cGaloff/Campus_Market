package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Producto findProductoByIdProducto(Long idProducto);
    Optional<Producto> findByNombre(String nombre);
}
