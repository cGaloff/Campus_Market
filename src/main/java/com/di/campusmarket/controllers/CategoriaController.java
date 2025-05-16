package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.CategoriaDTO;
import com.di.campusmarket.services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/api/categorias")
@AllArgsConstructor
public class CategoriaController {
    @Autowired
    private final CategoriaService categoriaService;

    @PostMapping
    public ResponseEntity<CategoriaDTO> crearCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        CategoriaDTO nuevaCategoria = categoriaService.createCategoria(categoriaDTO);
        return ResponseEntity.ok(nuevaCategoria);
    }


    @GetMapping("/{id}")
    public ResponseEntity<CategoriaDTO> obtenerPorId(@PathVariable Long id) {
        CategoriaDTO categoria = categoriaService.getCategoriaById(id);
        return ResponseEntity.ok(categoria);
    }


    @GetMapping("/nombre/{nombre}")
    public ResponseEntity<CategoriaDTO> obtenerPorNombre(@PathVariable String nombre) {
        CategoriaDTO categoria = categoriaService.getCategoriaByNombre(nombre);
        return ResponseEntity.ok(categoria);
    }


    @GetMapping
    public ResponseEntity<Set<CategoriaDTO>> obtenerTodas() {
        Set<CategoriaDTO> categorias = categoriaService.getAllCategorias();
        return ResponseEntity.ok(categorias);
    }


    @DeleteMapping
    public ResponseEntity<Void> eliminarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        categoriaService.deleteCategoria(categoriaDTO);
        return ResponseEntity.noContent().build();
    }
}
