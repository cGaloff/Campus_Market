package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByNombre(String nombre);
    Categoria findByProductoIdProducto(Long idProducto);

}
