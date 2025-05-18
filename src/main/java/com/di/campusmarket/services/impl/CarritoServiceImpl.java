package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.CarritoDTO;
import com.di.campusmarket.mappers.CarritoMapper;
import com.di.campusmarket.models.Carrito;
import com.di.campusmarket.repositories.CarritoRepository;
import com.di.campusmarket.services.CarritoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CarritoServiceImpl implements CarritoService {

    private final CarritoRepository carritoRepository;
    private final CarritoMapper carritoMapper;

    @Override
    public CarritoDTO createCarrito(CarritoDTO carrito) {
        Carrito carritoEntity = carritoMapper.toEntity(carrito);
        return carritoMapper.toDTO(carritoRepository.save(carritoEntity));
    }

    @Override
    public CarritoDTO getCarritoByUsuarioId(Long idUsuario) {
        return carritoRepository.findById(idUsuario).map(carritoMapper::toDTO).orElse(null);
    }

    @Override
    public Optional<CarritoDTO> getCarritoByPublicacionId(Long idPublicacion) {
        return carritoRepository.findByPublicacionIdPublicacion(idPublicacion).map(carritoMapper::toDTO);
    }
}
