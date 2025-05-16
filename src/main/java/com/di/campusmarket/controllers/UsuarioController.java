package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.UsuarioDTO;
import com.di.campusmarket.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO nuevoUsuario = usuarioService.createUsuario(usuarioDTO);
        return ResponseEntity.ok(nuevoUsuario);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarUsuario(@PathVariable Long id) {
        usuarioService.deleteUsuarioById(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/correo/{correo}")
    public ResponseEntity<UsuarioDTO> obtenerUsuarioPorCorreo(@PathVariable String correo) {
        UsuarioDTO usuario = usuarioService.getUsuarioByEmail(correo);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> obtenerUsuarioPorId(@PathVariable Long id) {
        UsuarioDTO usuario = usuarioService.getUsuarioById(id);
        return ResponseEntity.ok(usuario);
    }

    @GetMapping
    public ResponseEntity<List<UsuarioDTO>> obtenerTodosLosUsuarios() {
        List<UsuarioDTO> usuarios = usuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuarios);
    }
}
