package com.di.campusmarket.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NotificacionDTO {
    private Long idNotificacion;
    private String mensaje;
    private String titulo;
    private Long idPublicacion;
}
