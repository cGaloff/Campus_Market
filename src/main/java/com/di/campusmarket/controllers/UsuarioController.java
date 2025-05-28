package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.UsuarioDTO;
import com.di.campusmarket.mappers.UsuarioMapper;
import com.di.campusmarket.models.Usuario;
import com.di.campusmarket.repositories.UsuarioRepository;
import com.di.campusmarket.services.UsuarioService;
import com.di.campusmarket.services.security.JwtService;
import lombok.AllArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UsuarioController {
    @Autowired
    private final UsuarioService usuarioService;
    private final UsuarioRepository UsuarioRepository;
    private final JwtService JwtService;
    private final org.springframework.security.core.userdetails.UserDetailsService userDetailsService;
    private final org.springframework.security.crypto.password.PasswordEncoder passwordEncoder;
    private final org.springframework.security.authentication.AuthenticationManager authenticationManager;
    private final UsuarioMapper usuarioMapper;


    @PostMapping
    public ResponseEntity<UsuarioDTO> crearUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        UsuarioDTO nuevoUsuario = usuarioService.createUsuario(usuarioDTO);
        return ResponseEntity.ok(nuevoUsuario);
    }
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UsuarioDTO user) {
        if (UsuarioRepository.existsByUsername(user.getNombre())) {
            return ResponseEntity.badRequest().body("Error: Username is already taken!");
        }

        if (UsuarioRepository.existsByEmail(user.getCorreo())) {
            return ResponseEntity.badRequest().body("Error: Email is already in use!");
        }

        user.setContraseña(passwordEncoder.encode(user.getContraseña()));
        Usuario user1 = usuarioMapper.toEntity(user);
        UsuarioRepository.save(user1);

        return ResponseEntity.ok("User registered successfully!");
    }

    @PostMapping("/login")
    public ResponseEntity<?> authenticateUser(@RequestBody Map<String, String> loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.get("username"),
                        loginRequest.get("password")));

        UserDetails userDetails = userDetailsService.loadUserByUsername(loginRequest.get("username"));
        String jwt = JwtService.generateToken(userDetails.getUsername());

        Map<String, String> response = new HashMap<>();
        response.put("token", jwt);
        return ResponseEntity.ok(response);
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
