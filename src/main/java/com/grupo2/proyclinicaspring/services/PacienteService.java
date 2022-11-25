package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.PacienteEntity;

import java.util.List;

public interface PacienteService {

    public void save(PacienteEntity paciente);

    public List<PacienteEntity> findAll();

    public PacienteEntity findById(String idPaciente);

    public void delete(String idPaciente);
    
}
