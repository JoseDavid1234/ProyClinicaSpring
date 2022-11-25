package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.EnfermedadEntity;

import java.util.List;

public interface EnfermedadService {
    public void save(EnfermedadEntity enfermedad);

    public List<EnfermedadEntity> findAll();

    public EnfermedadEntity findById(String idEnfermedad);

    public void delete(String idEnfermedad);
}
