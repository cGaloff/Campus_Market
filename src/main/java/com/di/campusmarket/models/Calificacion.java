package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Calificacion")
public class Calificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCalificacion;
    private int valor;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;
}
