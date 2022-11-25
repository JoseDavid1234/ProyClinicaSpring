package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.TipoDiagEntity;
import com.grupo2.proyclinicaspring.models.entities.TipoDiagEntity;

import java.util.List;

public interface TipoDiagService {
    public void save(TipoDiagEntity tipoDiag);

    public List<TipoDiagEntity> findAll();

    public TipoDiagEntity findById(String idTipoDiag);

    public void delete(String idTipoDiag);
}
