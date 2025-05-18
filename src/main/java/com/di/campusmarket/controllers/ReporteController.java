package com.di.campusmarket.controllers;

import com.di.campusmarket.dtos.ReporteDTO;
import com.di.campusmarket.models.Reporte;
import com.di.campusmarket.services.ReporteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reportes")
@AllArgsConstructor
public class ReporteController {
    @Autowired
    private ReporteService reporteService;


    @PostMapping
    public ResponseEntity<ReporteDTO> crearReporte(@RequestBody ReporteDTO reporte) {
        ReporteDTO nuevoReporte = reporteService.createReporte(reporte);
        return ResponseEntity.ok(nuevoReporte);
    }


    @DeleteMapping
    public ResponseEntity<Void> eliminarReporte(@RequestBody ReporteDTO reporte) {
        reporteService.deleteReporte(reporte);
        return ResponseEntity.noContent().build();
    }


    @GetMapping("/usuario/{idUsuario}")
    public ResponseEntity<List<ReporteDTO>> obtenerPorUsuario(@PathVariable Long idUsuario) {
        List<ReporteDTO> reportes = reporteService.getAllByUsuarioId(idUsuario);
        return ResponseEntity.ok(reportes);
    }


    @GetMapping("/publicacion/{idPublicacion}")
    public ResponseEntity<List<ReporteDTO>> obtenerPorPublicacion(@PathVariable Long idPublicacion) {
        List<ReporteDTO> reportes = reporteService.getAllByPublicacionId(idPublicacion);
        return ResponseEntity.ok(reportes);
    }
}
