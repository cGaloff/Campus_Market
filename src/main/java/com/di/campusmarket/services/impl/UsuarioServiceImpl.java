package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.UsuarioDTO;
import com.di.campusmarket.mappers.UsuarioMapper;
import com.di.campusmarket.models.Usuario;
import com.di.campusmarket.repositories.UsuarioRepository;
import com.di.campusmarket.services.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final UsuarioMapper usuarioMapper;

    @Override
    public UsuarioDTO createUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(savedUsuario);
    }

    @Override
    public void deleteUsuario(UsuarioDTO usuario) {
        if (usuario.getIdUsuario() == null) {
            throw new RuntimeException("El id del usuario no puede ser nulo para eliminar");
        }
        usuarioRepository.deleteById(usuario.getIdUsuario());
    }

    @Override
    public UsuarioDTO getUsuarioByEmail(String correo) {
        Usuario usuario = usuarioRepository.findByCorreo(correo)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con correo: " + correo));
        return usuarioMapper.toDTO(usuario);
    }



    @Override
    public UsuarioDTO getUsuarioById(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con id: " + id));
        return usuarioMapper.toDTO(usuario);
    }

    @Override
    public List<UsuarioDTO> getAllUsuarios() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuarioMapper::toDTO)
                .collect(Collectors.toList());
    }
}
