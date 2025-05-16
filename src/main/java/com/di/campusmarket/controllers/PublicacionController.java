package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.PublicacionDTO;
import com.di.campusmarket.services.PublicacionService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publicaciones")
@AllArgsConstructor

public class PublicacionController {
    @Autowired
    private final PublicacionService publicacionService;


    @PostMapping
    public ResponseEntity<PublicacionDTO> crearPublicacion(@RequestBody PublicacionDTO publicacion) {
        PublicacionDTO nueva = publicacionService.createPublicacion(publicacion);
        return ResponseEntity.ok(nueva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPublicacion(@PathVariable Long id) {
        PublicacionDTO dto = new PublicacionDTO();
        dto.setIdPublicacion(id); // asegúrate de tener este setter en tu DTO
        publicacionService.deletePublicacion(dto);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PublicacionDTO> obtenerPorId(@PathVariable Long id) {
        PublicacionDTO publicacion = publicacionService.getPublicacionById(id);
        return ResponseEntity.ok(publicacion);
    }

    @GetMapping("/titulo/{titulo}")
    public ResponseEntity<PublicacionDTO> obtenerPorTitulo(@PathVariable String titulo) {
        PublicacionDTO publicacion = publicacionService.getPublicacionByTitulo(titulo);
        return ResponseEntity.ok(publicacion);
    }

    @GetMapping
    public ResponseEntity<List<PublicacionDTO>> obtenerTodas() {
        List<PublicacionDTO> lista = publicacionService.getAllPublicaciones();
        return ResponseEntity.ok(lista);
    }

}
