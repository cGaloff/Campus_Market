package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "RolUsuario")
public class RolUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @Column(name = "nombreRol")
    private String nombre;

    @OneToMany(mappedBy = "rolUsuario")
    private List<Usuario> usuarios;
}
