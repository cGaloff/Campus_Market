package com.di.campusmarket.repositories;

import com.di.campusmarket.models.RolUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolUsuarioRepository extends JpaRepository<RolUsuario, Long> {
    RolUsuario findByNombre(String nombre);
}
