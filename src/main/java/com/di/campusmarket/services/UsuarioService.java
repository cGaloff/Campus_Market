package com.di.campusmarket.services;

import com.di.campusmarket.dtos.UsuarioDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UsuarioService {
    UsuarioDTO createUsuario(UsuarioDTO usuario);
    void deleteUsuarioById(Long idUsuario);
    UsuarioDTO getUsuarioByEmail(String username);
    UsuarioDTO getUsuarioById(Long id);
    List<UsuarioDTO> getAllUsuarios();
}
