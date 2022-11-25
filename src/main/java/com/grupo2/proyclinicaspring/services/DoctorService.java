package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.DoctorEntity;

import java.util.List;

public interface DoctorService {

    public void save(DoctorEntity doctor);

    public List<DoctorEntity> findAll();

    public DoctorEntity findById(String idDoctor);

    public void delete(String idDoctor);
    
}
