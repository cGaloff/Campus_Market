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
    public NotificacionDTO createNotificacion(NotificacionDTO notificacionDTO) {
        Notificacion notificacionEntity = notificacionMapper.toEntity(notificacionDTO);
        return notificacionMapper.toDTO(notificacionRepository.save(notificacionEntity));
    }

    @Override
    public void deleteNotificacion(NotificacionDTO notificacionDTO) {
        notificacionRepository.delete(notificacionMapper.toEntity(notificacionDTO));
    }

    @Override
    public NotificacionDTO getNotifacionByIdPublicacion(Long idPublicacion) {
        return notificacionRepository.findByPublicacionIdPublicacion(idPublicacion).map(notificacionMapper::toDTO).orElse(null);
    }
}
