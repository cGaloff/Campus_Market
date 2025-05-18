package com.di.campusmarket.services;

import com.di.campusmarket.dtos.CarritoDTO;

import java.util.Optional;

public interface CarritoService {
    CarritoDTO createCarrito(CarritoDTO carrito);
    CarritoDTO getCarritoByUsuarioId(Long idUsuario);
    Optional<CarritoDTO> getCarritoByPublicacionId(Long idPublicacion);
}
