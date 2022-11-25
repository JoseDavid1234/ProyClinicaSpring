package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.EnfermedadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnfermedadEntityRepository extends JpaRepository<EnfermedadEntity, String> {
}