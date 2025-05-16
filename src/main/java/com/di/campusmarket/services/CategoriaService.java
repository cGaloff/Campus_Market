package com.di.campusmarket.services;

import com.di.campusmarket.dtos.CategoriaDTO;

import java.util.Set;

public interface CategoriaService {
    CategoriaDTO createCategoria(CategoriaDTO categoria);
    CategoriaDTO getCategoriaById(Long id);
    CategoriaDTO getCategoriaByNombre(String nombre);
    Set<CategoriaDTO> getAllCategorias();
    void deleteCategoria(CategoriaDTO categoria);
}
