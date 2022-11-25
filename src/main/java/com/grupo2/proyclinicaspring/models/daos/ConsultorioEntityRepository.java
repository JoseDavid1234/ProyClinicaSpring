package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.ConsultorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultorioEntityRepository extends JpaRepository<ConsultorioEntity, String> {
}