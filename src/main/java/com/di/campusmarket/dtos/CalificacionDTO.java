package com.di.campusmarket.dtos;

import com.di.campusmarket.models.Calificacion;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CalificacionDTO {
    private Long idCalificacion;
    private int valor;
    private String comentario;
    private Long idPublicacion;
}
