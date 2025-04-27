package com.di.campusmarket.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CarritoDTO {
    private Long idCarrito;
    private Long idUsuario;
    private Long idPublicacion;
}
