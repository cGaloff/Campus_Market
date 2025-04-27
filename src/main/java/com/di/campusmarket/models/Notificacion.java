package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "Notificacion")
@Data
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNotificacion;
    private String mensaje;
    private String titulo;

    @ManyToMany(mappedBy = "notificaciones")
    private List<Usuario> usuarios;

    @OneToOne(mappedBy = "notificacion")
    private Publicacion publicacion;

}
