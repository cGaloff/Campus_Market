package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.NotificacionDTO;
import com.di.campusmarket.models.Notificacion;
import com.di.campusmarket.services.NotificacionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/notificaciones")
@AllArgsConstructor
public class NotificacionController {
    @Autowired
    private final NotificacionService notificacionService;

    @PostMapping
    public ResponseEntity<NotificacionDTO> crearNotificacion(@RequestBody NotificacionDTO notificacion) {
        NotificacionDTO nuevaNotificacion = notificacionService.createNotificacion(notificacion);
        return ResponseEntity.ok(nuevaNotificacion);
    }

    @DeleteMapping
    public ResponseEntity<Void> eliminarNotificacion(@RequestBody NotificacionDTO notificacion) {
        notificacionService.deleteNotificacion(notificacion);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/publicacion/{idPublicacion}")
    public ResponseEntity<NotificacionDTO> obtenerPorPublicacion(@PathVariable Long idPublicacion) {
        NotificacionDTO notificacion = notificacionService.getNotifacionByIdPublicacion(idPublicacion);
        return ResponseEntity.ok(notificacion);
    }
}
