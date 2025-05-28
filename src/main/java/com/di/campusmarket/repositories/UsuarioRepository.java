package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Emprendimiento;
import com.di.campusmarket.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByIdUsuario(Long idUsuario);
    Optional<Usuario> findByNombre(String nombre);

    boolean existsByCorreo(String email);
    Optional<Usuario> findByCorreo(String correo);
    Optional<Usuario> findByEmprendimiento(Emprendimiento emprendimiento);
}
