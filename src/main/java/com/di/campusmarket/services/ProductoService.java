package com.di.campusmarket.services;

import com.di.campusmarket.dtos.ProductoDTO;

public interface ProductoService {
    ProductoDTO createProducto(ProductoDTO producto);
    ProductoDTO getProductoById(Long id);
    ProductoDTO getProductoByNombre(String nombre);
    void deleteProducto(ProductoDTO producto);
}
