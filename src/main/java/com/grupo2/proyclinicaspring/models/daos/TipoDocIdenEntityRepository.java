package com.grupo2.proyclinicaspring.models.daos;

import com.grupo2.proyclinicaspring.models.entities.TipoDocIdenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoDocIdenEntityRepository extends JpaRepository<TipoDocIdenEntity, String> {
}