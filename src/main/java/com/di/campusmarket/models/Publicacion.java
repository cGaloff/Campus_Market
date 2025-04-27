package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "Publicacion")
public class Publicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPublicacion;
    private String titulo;
    private String descripcion;
    private Date fechaPublicacion;

    @ManyToOne
    @JoinColumn(name = "idEmprendimiento")
    private Emprendimiento emprendimiento;

    @OneToMany(mappedBy = "publicacion")
    private List<Calificacion> calificaciones;

    @OneToOne(mappedBy = "publicacion")
    private Producto producto;

    @ManyToOne
    @JoinColumn(name = "idReporte")
    private Reporte reporte;

    @OneToOne
    @JoinColumn(name = "idNotificacion")
    private Notificacion notificacion;

}
