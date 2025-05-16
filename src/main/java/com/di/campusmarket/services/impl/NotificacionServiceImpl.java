package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.NotificacionDTO;
import com.di.campusmarket.mappers.NotificacionMapper;
import com.di.campusmarket.models.Notificacion;
import com.di.campusmarket.repositories.NotificacionRepository;
import com.di.campusmarket.services.NotificacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class NotificacionServiceImpl implements NotificacionService {
    private final NotificacionRepository notificacionRepository;
    private final NotificacionMapper notificacionMapper;

    @Override
    public NotificacionDTO createNotificacion(Notificacion notificacion) {
        return null;
    }

    @Override
    public void deleteNotificacion(Notificacion notificacion) {

    }

    @Override
    public NotificacionDTO getNotifacionByIdPublicacion(Long idPublicacion) {
        return null;
    }
}
