package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.DoctorEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.DoctorEntity;
import com.grupo2.proyclinicaspring.models.entities.DoctorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{
    @Autowired
    DoctorEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(DoctorEntity doctor) {
        dao.save(doctor);
    }

    @Override
    @Transactional(readOnly = true)
    public List<DoctorEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public DoctorEntity findById(String idDoctorEntity) {
        return dao.findById(idDoctorEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idDoctorEntity) {
        dao.deleteById(idDoctorEntity);
    }
}
