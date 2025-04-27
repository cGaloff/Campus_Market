package com.di.campusmarket.repositories;

import com.di.campusmarket.models.Emprendimiento;
import com.di.campusmarket.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByIdUsuario(Long idUsuario);
    Usuario findByNombre(String nombre);
    Usuario findByEmail(String email);
    Usuario findByEmprendimiento(Emprendimiento emprendimiento);
}
