package com.di.campusmarket.services.impl;

import com.di.campusmarket.dtos.EmprendimientoDTO;
import com.di.campusmarket.mappers.EmprendimientoMapper;
import com.di.campusmarket.models.Emprendimiento;
import com.di.campusmarket.repositories.EmprendimientoRepository;
import com.di.campusmarket.services.EmprendimientoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class EmprendimientoServiceImpl implements EmprendimientoService {
    private final EmprendimientoRepository emprendimientoRepository;
    private final EmprendimientoMapper emprendimientoMapper;

    @Override
    public EmprendimientoDTO createEmprendimiento(EmprendimientoDTO emprendimientoDTO) {
        Emprendimiento emprendimiento = emprendimientoMapper.toEntity(emprendimientoDTO);
        Emprendimiento savedEmprendimiento = emprendimientoRepository.save(emprendimiento);
        return emprendimientoMapper.toDTO(savedEmprendimiento);
    }

    @Override
    public EmprendimientoDTO getEmprendimientoById(Long id) {
        Emprendimiento emprendimiento = emprendimientoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Emprendimiento no encontrado con id: " + id));
        return emprendimientoMapper.toDTO(emprendimiento);
    }

    @Override
    public List<EmprendimientoDTO> getAllEmprendimientos() {
        return emprendimientoRepository.findAll()
                .stream()
                .map(emprendimientoMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteEmprendimiento(EmprendimientoDTO emprendimientoDTO) {
        if (emprendimientoDTO.getIdEmprendimiento() == null) {
            throw new RuntimeException("El id del emprendimiento no puede ser nulo para eliminar");
        }
        emprendimientoRepository.deleteById(emprendimientoDTO.getIdEmprendimiento());
    }
}
