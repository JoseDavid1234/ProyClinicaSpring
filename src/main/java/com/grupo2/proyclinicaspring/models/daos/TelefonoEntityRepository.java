package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.TelefonoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TelefonoEntityRepository extends JpaRepository<TelefonoEntity, String> {
}