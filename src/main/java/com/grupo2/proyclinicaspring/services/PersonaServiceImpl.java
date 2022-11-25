package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.PersonaEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.PersonaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonaServiceImpl implements PersonaService{
    @Autowired
    PersonaEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(PersonaEntity persona) {
        dao.save(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public List<PersonaEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public PersonaEntity findById(String idPersonaEntity) {
        return dao.findById(idPersonaEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idPersonaEntity) {
        dao.deleteById(idPersonaEntity);
    }
}
