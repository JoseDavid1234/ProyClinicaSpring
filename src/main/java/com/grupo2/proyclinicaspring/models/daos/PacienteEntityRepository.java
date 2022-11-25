package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.PacienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteEntityRepository extends JpaRepository<PacienteEntity, String> {
}