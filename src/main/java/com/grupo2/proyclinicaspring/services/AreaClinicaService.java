package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.AreaClinicaEntity;

import java.util.List;

public interface AreaClinicaService {

    public void save(AreaClinicaEntity areaClinica);

    public List<AreaClinicaEntity> findAll();

    public AreaClinicaEntity findById(String idAreaClinica);

    public void delete(String idAreaClinica);
    
}
