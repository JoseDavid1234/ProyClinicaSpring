package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.TipoDiagEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.TipoDiagEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoDiagServiceImpl implements TipoDiagService{
    @Autowired
    TipoDiagEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(TipoDiagEntity tipoDiag) {
        dao.save(tipoDiag);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TipoDiagEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoDiagEntity findById(String idTipoDiagEntity) {
        return dao.findById(idTipoDiagEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idTipoDiagEntity) {
        dao.deleteById(idTipoDiagEntity);
    }
}
