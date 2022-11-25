package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.TipoDocIdenEntity;

import java.util.List;

public interface TipoDocIdenService {
    public void save(TipoDocIdenEntity tipoDocIden);

    public List<TipoDocIdenEntity> findAll();

    public TipoDocIdenEntity findById(String idTipoDocIden);

    public void delete(String idTipoDocIden);
}
