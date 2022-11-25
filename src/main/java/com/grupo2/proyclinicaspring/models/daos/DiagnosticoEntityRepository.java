package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.DiagnosticoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiagnosticoEntityRepository extends JpaRepository<DiagnosticoEntity, String> {
}