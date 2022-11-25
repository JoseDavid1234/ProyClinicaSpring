package com.grupo2.proyclinicaspring.services;

import com.grupo2.proyclinicaspring.models.daos.TipoDocIdenEntityRepository;
import com.grupo2.proyclinicaspring.models.entities.TipoDocIdenEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TipoDocIdenServiceImpl implements TipoDocIdenService{
    @Autowired
    TipoDocIdenEntityRepository dao;

    @Override
    @Transactional(readOnly = false)
    public void save(TipoDocIdenEntity tipoDocIden) {
        dao.save(tipoDocIden);
    }

    @Override
    @Transactional(readOnly = true)
    public List<TipoDocIdenEntity> findAll() {
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public TipoDocIdenEntity findById(String idTipoDocIdenEntity) {
        return dao.findById(idTipoDocIdenEntity).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(String idTipoDocIdenEntity) {
        dao.deleteById(idTipoDocIdenEntity);
    }

}
