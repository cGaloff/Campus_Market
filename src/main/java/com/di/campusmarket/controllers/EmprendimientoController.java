package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.EmprendimientoDTO;
import com.di.campusmarket.services.EmprendimientoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/emprendimientos")
public class EmprendimientoController {
    @Autowired
    private final EmprendimientoService emprendimientoService;


    @PostMapping
    public ResponseEntity<EmprendimientoDTO> createEmprendimiento(@RequestBody EmprendimientoDTO emprendimiento) {
        EmprendimientoDTO nuevo = emprendimientoService.createEmprendimiento(emprendimiento);
        return ResponseEntity.ok(nuevo);
    }


    @GetMapping("/{id}")
    public ResponseEntity<EmprendimientoDTO> getEmprendimientoById(@PathVariable Long id) {
        EmprendimientoDTO emprendimiento = emprendimientoService.getEmprendimientoById(id);
        return ResponseEntity.ok(emprendimiento);
    }


    @GetMapping
    public ResponseEntity<List<EmprendimientoDTO>> getAllEmprendimientos() {
        List<EmprendimientoDTO> lista = emprendimientoService.getAllEmprendimientos();
        return ResponseEntity.ok(lista);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        EmprendimientoDTO dto = new EmprendimientoDTO();
        dto.setIdEmprendimiento(id);
        emprendimientoService.deleteEmprendimiento(dto);
        return ResponseEntity.noContent().build();
    }

}
