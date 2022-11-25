package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.EnfermedadEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.EnfermedadEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EnfermedadServiceImpl implements EnfermedadService{
    @Autowired
    EnfermedadEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(EnfermedadEntity enfermedad) {
        dao.save(enfermedad);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EnfermedadEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EnfermedadEntity findById(String idEnfermedadEntity) {
        return dao.findById(idEnfermedadEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idEnfermedadEntity) {
        dao.deleteById(idEnfermedadEntity);
    }
}
