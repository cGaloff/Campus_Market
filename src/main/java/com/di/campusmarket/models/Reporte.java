package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table(name = "Reporte")
@Entity
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReporte;
    private String descripcion;
    private String motivo;
    @Column(name = "fechaReporte")
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
}
