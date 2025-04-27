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
public class ReporteDTO {
    private Long idReporte;
    private String descripcion;
    private String motivo;
    private Date fecha;
    private Long idUsuario;  //
}
