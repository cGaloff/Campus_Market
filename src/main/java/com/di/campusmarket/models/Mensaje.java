package com.di.campusmarket.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Mensaje")
@Data
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMensaje;
    private String mensaje;
    private String remitente;
    private String destinatario;
}
