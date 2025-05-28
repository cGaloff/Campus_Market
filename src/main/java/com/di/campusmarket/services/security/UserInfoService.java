package com.di.campusmarket.services.security;

import com.di.campusmarket.dtos.UsuarioDTO;
import com.di.campusmarket.models.RolUsuario;
import com.di.campusmarket.models.Usuario;
import com.di.campusmarket.repositories.RolUsuarioRepository;
import com.di.campusmarket.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserInfoService implements UserDetailsService {
    @Autowired
    private RolUsuarioRepository rolUsuarioRepository;
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UserInfoService(UsuarioRepository usuarioRepository, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }
    @Override
    public UserDetails loadUserByUsername(String correo) throws UsernameNotFoundException {
        Optional<Usuario> usuarioDetail = usuarioRepository.findByCorreo(correo);
        return usuarioDetail.map(UserInfoDetail::new).orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con correo: " + correo));
    }

    public UsuarioDTO addUsuario(UsuarioDTO dto) {
        RolUsuario rol = rolUsuarioRepository.findByNombre(dto.getRol())
                .orElseThrow(() -> new RuntimeException("Rol no encontrado: " + dto.getRol()));

        Usuario usuario = new Usuario();
        usuario.setNombre(dto.getNombre());
        usuario.setApellido(dto.getApellido());
        usuario.setCorreo(dto.getCorreo());
        usuario.setContraseña(passwordEncoder.encode(dto.getContraseña()));
        usuario.setRolUsuario(rol);

        Usuario usuarioGuardado = usuarioRepository.save(usuario);

        return new UsuarioDTO(usuarioGuardado.getIdUsuario(), usuarioGuardado.getNombre(), usuarioGuardado.getApellido(), usuarioGuardado.getCorreo(),
                null, usuarioGuardado.getRolUsuario().getNombre()
        );
    }
}
