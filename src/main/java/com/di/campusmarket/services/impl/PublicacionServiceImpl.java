package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.PublicacionDTO;
import com.di.campusmarket.mappers.PublicacionMapper;
import com.di.campusmarket.models.Publicacion;
import com.di.campusmarket.repositories.PublicacionRepository;
import com.di.campusmarket.services.PublicacionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PublicacionServiceImpl implements PublicacionService {
    private final PublicacionRepository publicacionRepository;
    private final PublicacionMapper publicacionMapper;

    @Override
    public PublicacionDTO createPublicacion(PublicacionDTO publicacionDTO) {
        Publicacion publicacion = publicacionMapper.toEntity(publicacionDTO);
        Publicacion savedPublicacion = publicacionRepository.save(publicacion);
        return publicacionMapper.toDTO(savedPublicacion);
    }

    @Override
    public void deletePublicacion(PublicacionDTO publicacionDTO) {
        if (publicacionDTO.getIdPublicacion() == null) {
            throw new RuntimeException("El id de la publicación no puede ser nulo para eliminar");
        }
        publicacionRepository.deleteById(publicacionDTO.getIdPublicacion());
    }

    @Override
    public PublicacionDTO getPublicacionById(Long id) {
        Publicacion publicacion = publicacionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Publicación no encontrada con id: " + id));
        return publicacionMapper.toDTO(publicacion);
    }

    @Override
    public PublicacionDTO getPublicacionByTitulo(String titulo) {
        Publicacion publicacion = publicacionRepository.findByTitulo(titulo);
        if (publicacion == null) {
            throw new RuntimeException("Publicación no encontrada con título: " + titulo);
        }
        return publicacionMapper.toDTO(publicacion);
    }

    @Override
    public List<PublicacionDTO> getAllPublicaciones() {
        return publicacionRepository.findAll()
                .stream()
                .map(publicacionMapper::toDTO)
                .collect(Collectors.toList());
    }
}
