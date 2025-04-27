package com.di.campusmarket.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductoDTO {
    private Long idProducto;
    private String nombre;
    private double precio;
    private Long idPublicacion;
}
