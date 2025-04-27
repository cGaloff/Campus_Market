package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Carrito")
@Data
public class Carrito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCarrito;

    @OneToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;

}
