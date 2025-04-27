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
public class EmprendimientoDTO {
    private Long idEmprendimiento;
    private String nombre;
    private String descripcion;
    private Date fechaCreacion;
    private Long idUsuario;
}
