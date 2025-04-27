package com.di.campusmarket.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriaDTO {
    private Long idCategoria;
    private String nombre;
    private String descripcion;

}
