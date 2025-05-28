package com.di.campusmarket.dtos;

import lombok.*;
import org.springframework.lang.Nullable;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTO {
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    @Nullable
    private String rol;

    public UsuarioDTO(Long idUsuario, String nombre, String apellido, String correo, Object o, String nombre1) {
    }
}
