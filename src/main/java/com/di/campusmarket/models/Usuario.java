package com.di.campusmarket.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
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

    @ManyToMany
    @JoinTable(
            name = "usuario_notificacion",
            joinColumns = @JoinColumn(name = "idUsuario"),
            inverseJoinColumns = @JoinColumn(name = "idNotificacion")
    )
    private List<Notificacion> notificaciones;

    public Usuario(Object o, String nombre, String apellido, String correo, String encode, String rol) {

    }
}
