package com.di.campusmarket.services.security;

import com.di.campusmarket.models.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserInfoDetail implements UserDetails {

    private String correo;
    private String contrasena;
    private List<GrantedAuthority> roles;

    public UserInfoDetail(Usuario usuario){
        correo = usuario.getCorreo();
        contrasena = usuario.getContraseña();
        roles = List.of(new SimpleGrantedAuthority("ROLE_" + usuario.getRolUsuario().getNombre().toUpperCase()));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public String getUsername() {
        return "";
    }
}
