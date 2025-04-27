package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Producto")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;
    private String nombre;
    private double precio;

    @OneToOne
    @JoinColumn(name = "idPublicacion")
    private Publicacion publicacion;

    @OneToOne(mappedBy = "producto")
    private Categoria categoria;

}
