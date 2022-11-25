package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.PersonaEntity;

import java.util.List;

public interface PersonaService {
    public void save(PersonaEntity persona);

    public List<PersonaEntity> findAll();

    public PersonaEntity findById(String idPersona);

    public void delete(String idPersona);

}
