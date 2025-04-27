package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.UsuarioDTO;
import com.di.campusmarket.models.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {
    UsuarioDTO toDTO(UsuarioDTO usuario);
    Usuario toEntity(UsuarioDTO usuarioDTO);
}
