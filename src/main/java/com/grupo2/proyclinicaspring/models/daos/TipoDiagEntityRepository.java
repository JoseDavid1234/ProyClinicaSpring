package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.TipoDiagEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDiagEntityRepository extends JpaRepository<TipoDiagEntity, String> {
}