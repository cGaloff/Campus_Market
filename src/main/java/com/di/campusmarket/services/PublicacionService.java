package com.di.campusmarket.services;

import com.di.campusmarket.dtos.PublicacionDTO;

import java.util.List;

public interface PublicacionService {
    PublicacionDTO createPublicacion(PublicacionDTO publicacion);
    void deletePublicacion(PublicacionDTO publicacion);
    PublicacionDTO getPublicacionById(Long id);
    PublicacionDTO getPublicacionByTitulo(String titulo);
    List<PublicacionDTO> getAllPublicaciones();
}
