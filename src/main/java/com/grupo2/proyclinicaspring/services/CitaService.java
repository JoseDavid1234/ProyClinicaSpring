package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.entities.CitaEntity;

import java.util.List;

public interface CitaService {

    public void save(CitaEntity cita);

    public List<CitaEntity> findAll();

    public CitaEntity findById(String idCita);

    public void delete(String idCita);

    public Long count();

    public List<CitaEntity> findByPacienteCodPerOrderByFecCitaDesc(String codPac);

    public List<CitaEntity> findAllByPacienteCodPer(String codPer);

}
