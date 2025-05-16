package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.CarritoDTO;
import com.di.campusmarket.mappers.CarritoMapper;
import com.di.campusmarket.repositories.CarritoRepository;
import com.di.campusmarket.services.CarritoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CarritoServiceImpl implements CarritoService {

    private final CarritoRepository carritoRepository;
    private final CarritoMapper carritoMapper;

    @Override
    public CarritoDTO createCarrito(CarritoDTO carrito) {
        return null;
    }

    @Override
    public CarritoDTO getCarritoByUsuarioId(Long idUsuario) {
        return null;
    }

    @Override
    public CarritoDTO getCarritoByPublicacionId(Long idPublicacion) {
        return null;
    }
}
