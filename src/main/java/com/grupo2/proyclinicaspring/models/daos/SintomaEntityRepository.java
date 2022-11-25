package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.SintomaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SintomaEntityRepository extends JpaRepository<SintomaEntity, String> {
}