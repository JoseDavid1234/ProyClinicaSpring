package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.TelefonoEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.TelefonoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TelefonoServiceImpl implements TelefonoService{

    @Autowired
    TelefonoEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(TelefonoEntity telefono) {
        dao.save(telefono);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TelefonoEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TelefonoEntity findById(String idTelefonoEntity) {
        return dao.findById(idTelefonoEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idTelefonoEntity) {
        dao.deleteById(idTelefonoEntity);
    }
}
