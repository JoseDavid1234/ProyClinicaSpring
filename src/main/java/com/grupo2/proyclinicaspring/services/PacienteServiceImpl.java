package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.PacienteEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.PacienteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteServiceImpl implements PacienteService{
    @Autowired
    PacienteEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(PacienteEntity paciente) {
        dao.save(paciente);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PacienteEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PacienteEntity findById(String idPacienteEntity) {
        return dao.findById(idPacienteEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idPacienteEntity) {
        dao.deleteById(idPacienteEntity);
    }
}
