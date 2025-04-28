package com.di.campusmarket.services;

import com.di.campusmarket.dtos.EmprendimientoDTO;
import com.di.campusmarket.models.Emprendimiento;

import java.util.List;

public interface EmprendimientoService {
    EmprendimientoDTO createEmprendimiento(EmprendimientoDTO emprendimiento);
    EmprendimientoDTO getEmprendimientoById(Long id);
    List<EmprendimientoDTO> getAllEmprendimientos();
    void deleteEmprendimiento(EmprendimientoDTO emprendimiento);
}
