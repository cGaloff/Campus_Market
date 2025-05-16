package com.di.campusmarket.services;

import com.di.campusmarket.dtos.CarritoDTO;

public interface CarritoService {
    CarritoDTO createCarrito(CarritoDTO carrito);
    CarritoDTO getCarritoByUsuarioId(Long idUsuario);
    CarritoDTO getCarritoByPublicacionId(Long idPublicacion);
}
