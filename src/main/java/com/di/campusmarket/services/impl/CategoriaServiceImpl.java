package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.CategoriaDTO;
import com.di.campusmarket.mappers.CategoriaMapper;
import com.di.campusmarket.repositories.CategoriaRepository;
import com.di.campusmarket.services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@AllArgsConstructor
public class CategoriaServiceImpl implements CategoriaService {
    private final CategoriaRepository categoriaRepository;
    private final CategoriaMapper categoriaMapper;


    @Override
    public CategoriaDTO createCategoria(CategoriaDTO categoria) {
        return null;
    }

    @Override
    public CategoriaDTO getCategoriaById(Long id) {
        return null;
    }

    @Override
    public CategoriaDTO getCategoriaByNombre(String nombre) {
        return null;
    }

    @Override
    public Set<CategoriaDTO> getAllCategorias() {
        return Set.of();
    }

    @Override
    public void deleteCategoria(CategoriaDTO categoria) {

    }
}
