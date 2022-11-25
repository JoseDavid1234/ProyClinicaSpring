package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.EmpTipDocEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpTipDocEntityRepository extends JpaRepository<EmpTipDocEntity, String> {
}