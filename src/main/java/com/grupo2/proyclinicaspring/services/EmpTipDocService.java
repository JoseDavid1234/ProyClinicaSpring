package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.EmpTipDocEntity;

import java.util.List;

public interface EmpTipDocService {

    public void save(EmpTipDocEntity empTipDoc);

    public List<EmpTipDocEntity> findAll();

    public EmpTipDocEntity findById(String idEmpTipDoc);

    public void delete(String idEmpTipDoc);
}
