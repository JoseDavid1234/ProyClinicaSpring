package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.DiagnosticoEntity;
import com.grupo2.proyclinicaspring.models.entities.DiagnosticoEntity;

import java.util.List;

public interface DiagnosticoService {
    
    public void save(DiagnosticoEntity diagnostico);

    public List<DiagnosticoEntity> findAll();

    public DiagnosticoEntity findById(String idDiagnostico);

    public void delete(String idDiagnostico);
    
}
