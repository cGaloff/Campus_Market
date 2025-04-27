package com.di.campusmarket.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublicacionDTO {
    private Long idPublicacion;
    private String titulo;
    private String descripcion;
    private Date fechaPublicacion;
    private Long idEmprendimiento;
}
