package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    Producto findProductoByIdProducto(Long idProducto);
    Producto findByNombre(String nombre);
}
