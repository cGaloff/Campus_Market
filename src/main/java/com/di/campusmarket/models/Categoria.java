package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategoria;
    private String nombre;
    private String descripcion;

    @OneToOne
    @JoinColumn(name = "idProducto")
    private Producto producto;
}
