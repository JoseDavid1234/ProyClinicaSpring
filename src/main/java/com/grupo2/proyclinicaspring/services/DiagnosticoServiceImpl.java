package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.DiagnosticoEntityRepository;
import com.grupo2.proyclinicaspring.models.daos.DiagnosticoEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.DiagnosticoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DiagnosticoServiceImpl implements DiagnosticoService{
    @Autowired
    DiagnosticoEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(DiagnosticoEntity diagnostico) {
        dao.save(diagnostico);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DiagnosticoEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DiagnosticoEntity findById(String idDiagnosticoEntity) {
        return dao.findById(idDiagnosticoEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idDiagnosticoEntity) {
        dao.deleteById(idDiagnosticoEntity);
    }
}
