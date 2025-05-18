package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.ProductoDTO;
import com.di.campusmarket.mappers.ProductoMapper;
import com.di.campusmarket.models.Producto;
import com.di.campusmarket.repositories.ProductoRepository;
import com.di.campusmarket.services.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService {

    private final ProductoMapper productoMapper;
    private final ProductoRepository productoRepository;

    @Override
    public ProductoDTO createProducto(ProductoDTO producto) {
        Producto productoEntity = productoMapper.toEntity(producto);
        return productoMapper.toDTO(productoRepository.save(productoEntity));
    }

    @Override
    public ProductoDTO getProductoById(Long id) {
        return productoRepository.findById(id).map(productoMapper::toDTO).orElse(null);
    }

    @Override
    public ProductoDTO getProductoByNombre(String nombre) {
        return productoRepository.findByNombre(nombre).map(productoMapper::toDTO).orElse(null);
    }

    @Override
    public void deleteProducto(ProductoDTO producto) {
        productoRepository.deleteById(producto.getIdProducto());
    }
}
