package com.di.campusmarket.models;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;


@Entity
@Data
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private Date fechaRegistro;

    @ManyToOne
    @JoinColumn(name = "idRol")
    private  RolUsuario rolUsuario;

    @OneToMany
    @JoinColumn(name = "idUsuario")
    private List<Reporte> reportes;

    @OneToOne(mappedBy = "usuario")
    private Emprendimiento emprendimiento;

}
