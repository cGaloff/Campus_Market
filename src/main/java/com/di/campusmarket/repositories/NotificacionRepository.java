package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Notificacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NotificacionRepository extends JpaRepository<Notificacion, Long> {
    Optional<Notificacion> findByPublicacionIdPublicacion(Long idPublicacion);
    List<Notificacion> findByUsuariosIdUsuario(Long idUsuario);

}
