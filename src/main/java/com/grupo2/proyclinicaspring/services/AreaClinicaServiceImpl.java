package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.AreaClinicaEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.AreaClinicaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AreaClinicaServiceImpl implements AreaClinicaService{

    @Autowired
    AreaClinicaEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(AreaClinicaEntity areaClinica) {
        dao.save(areaClinica);
    }

    @Override
    @Transactional(readOnly = true)
    public List<AreaClinicaEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public AreaClinicaEntity findById(String idAreaClinicaEntity) {
        return dao.findById(idAreaClinicaEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idAreaClinicaEntity) {
        dao.deleteById(idAreaClinicaEntity);
    }
    
}
