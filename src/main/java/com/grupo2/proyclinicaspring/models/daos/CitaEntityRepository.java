package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.CitaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CitaEntityRepository extends JpaRepository<CitaEntity, String> {

    public List<CitaEntity> findByPacienteCodPerOrderByFecCitaDesc(String codPac);

    public List<CitaEntity> findAllByPacienteCodPer(String codPer);

}