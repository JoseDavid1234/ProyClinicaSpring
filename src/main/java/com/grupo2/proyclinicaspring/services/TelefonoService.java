package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.TelefonoEntity;

import java.util.List;

public interface TelefonoService {

    public void save(TelefonoEntity telefono);

    public List<TelefonoEntity> findAll();

    public TelefonoEntity findById(String idTelefono);

    public void delete(String idTelefono);

}
