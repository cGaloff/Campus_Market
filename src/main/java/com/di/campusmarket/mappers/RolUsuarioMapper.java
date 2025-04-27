package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.RolUsuarioDTO;
import com.di.campusmarket.models.RolUsuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RolUsuarioMapper {
    RolUsuarioDTO toDTO(RolUsuario rolUsuario);
    RolUsuario toEntity(RolUsuarioDTO rolUsuarioDTO);
}
