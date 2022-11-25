package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.CitaEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.CitaEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    CitaEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(CitaEntity cita) {
        dao.save(cita);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CitaEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public CitaEntity findById(String idCitaEntity) {
        return dao.findById(idCitaEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idCitaEntity) {
        dao.deleteById(idCitaEntity);
    }

    @Override
    @Transactional(readOnly = true)
    public Long count() {
        return dao.count();
    }

    @Override
    @Transactional(readOnly = true)
    public List<CitaEntity> findByPacienteCodPerOrderByFecCitaDesc(String codPac) {
        return dao.findByPacienteCodPerOrderByFecCitaDesc(codPac);
    }

    @Override
    @Transactional(readOnly = true)
    public List<CitaEntity> findAllByPacienteCodPer(String codPer) {
        return dao.findAllByPacienteCodPer(codPer);
    }

}
