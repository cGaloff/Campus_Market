package com.di.campusmarket.dtos;

import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class UsuarioDTO {
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private Long idRolUsuario;
}
