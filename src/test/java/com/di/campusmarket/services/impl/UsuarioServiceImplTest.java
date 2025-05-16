package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.UsuarioDTO;
import com.di.campusmarket.mappers.UsuarioMapper;
import com.di.campusmarket.models.Usuario;
import com.di.campusmarket.repositories.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UsuarioServiceImplTest {

    @Mock
    UsuarioRepository usuarioRepository;

    @Mock
    UsuarioMapper  usuarioMapper;

    @InjectMocks
    UsuarioServiceImpl usuarioService;

    @BeforeEach
    void setUp() {
        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setIdUsuario(1L);
        usuarioDTO.setNombre("Sebastian");
        usuarioDTO.setApellido("Galoff");
        usuarioDTO.setCorreo("email.com");

        Usuario usuario = new Usuario();
        usuario.setIdUsuario(1L);
        usuario.setNombre("Sebastian");
        usuario.setApellido("Galoff");
        usuario.setCorreo("email.com");

    }

    @Test
    void createUsuario() {
    }

    @Test
    void deleteUsuario() {
    }

    @Test
    void getUsuarioByEmail() {
    }

    @Test
    void getUsuarioById() {
    }

    @Test
    void getAllUsuarios() {
    }
}