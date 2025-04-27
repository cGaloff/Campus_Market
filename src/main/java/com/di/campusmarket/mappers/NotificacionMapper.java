package com.di.campusmarket.mappers;

import com.di.campusmarket.dtos.NotificacionDTO;
import com.di.campusmarket.models.Notificacion;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificacionMapper {
    NotificacionDTO toDTO(NotificacionDTO notificacion);
    Notificacion toEntity(NotificacionDTO notificacionDTO);

}
