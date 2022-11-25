package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorEntityRepository extends JpaRepository<DoctorEntity, String> {
}