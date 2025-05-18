package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.CategoriaDTO;
import com.di.campusmarket.models.Categoria;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaMapper {
    CategoriaDTO toDTO(Categoria categoria);
    Categoria toEntity(CategoriaDTO categoriaDTO);
}
