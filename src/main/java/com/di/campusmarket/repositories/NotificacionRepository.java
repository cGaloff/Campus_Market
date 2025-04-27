package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    Notificacion findByUsuarioIdAndPublicacionId(Long usuarioId, Long publicacionId);
    Notificacion findByPublicacion(Long publicacion);
    List<Notificacion> findByUsuario(Long usuario);
}
