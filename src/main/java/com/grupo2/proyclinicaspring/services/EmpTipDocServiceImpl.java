package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.EmpTipDocEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.EmpTipDocEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpTipDocServiceImpl implements EmpTipDocService{
    @Autowired
    EmpTipDocEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(EmpTipDocEntity empTipDoc) {
        dao.save(empTipDoc);
    }

    @Override
    @Transactional(readOnly = true)
    public List<EmpTipDocEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public EmpTipDocEntity findById(String idEmpTipDocEntity) {
        return dao.findById(idEmpTipDocEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idEmpTipDocEntity) {
        dao.deleteById(idEmpTipDocEntity);
    }
}
