package com.di.campusmarket.services;

import com.di.campusmarket.dtos.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    UsuarioDTO createUsuario(UsuarioDTO usuario);
    void deleteUsuario(UsuarioDTO usuario);
    UsuarioDTO getUsuarioByEmail(String username);
    UsuarioDTO getUsuarioById(Long id);
    List<UsuarioDTO> getAllUsuarios();
}
