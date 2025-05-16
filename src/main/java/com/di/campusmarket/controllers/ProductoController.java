package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.ProductoDTO;
import com.di.campusmarket.services.ProductoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/productos")
@AllArgsConstructor
public class ProductoController {
    @Autowired
    private final ProductoService productoService;

    // Crear producto
    @PostMapping
    public ResponseEntity<ProductoDTO> crearProducto(@RequestBody ProductoDTO producto) {
        ProductoDTO creado = productoService.createProducto(producto);
        return ResponseEntity.ok(creado);
    }

    // Obtener producto por ID
    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> obtenerProductoPorId(@PathVariable Long id) {
        ProductoDTO producto = productoService.getProductoById(id);
        return ResponseEntity.ok(producto);
    }

    // Obtener producto por nombre
    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<ProductoDTO> obtenerProductoPorNombre(@PathVariable String nombre) {
        ProductoDTO producto = productoService.getProductoByNombre(nombre);
        return ResponseEntity.ok(producto);
    }

    // Eliminar producto
    @DeleteMapping
    public ResponseEntity<Void> eliminarProducto(@RequestBody ProductoDTO producto) {
        productoService.deleteProducto(producto);
        return ResponseEntity.noContent().build();
    }

}
