package com.di.campusmarket.services;

import com.di.campusmarket.dtos.NotificacionDTO;
import com.di.campusmarket.models.Notificacion;

public interface NotificacionService {
    NotificacionDTO createNotificacion(NotificacionDTO notificacion);
    void deleteNotificacion(NotificacionDTO notificacion);
    NotificacionDTO getNotifacionByIdPublicacion(Long idPublicacion);

}
