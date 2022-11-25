package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaEntityRepository extends JpaRepository<PersonaEntity, String> {
}