package com.di.campusmarket.services;

import com.di.campusmarket.dtos.NotificacionDTO;
import com.di.campusmarket.models.Notificacion;

public interface NotificacionService {
    NotificacionDTO createNotificacion(Notificacion notificacion);
    void deleteNotificacion(Notificacion notificacion);
    NotificacionDTO getNotifacionByIdPublicacion(Long idPublicacion);

}
