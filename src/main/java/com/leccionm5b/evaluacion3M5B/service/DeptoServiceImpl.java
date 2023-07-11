/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leccionm5b.evaluacion3M5B.service;

import com.leccionm5b.evaluacion3M5B.model.Depto;
import com.leccionm5b.evaluacion3M5B.repository.DeptoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class DeptoServiceImpl extends GenericServiceImpl<Depto, Long> implements GenericService<Depto, Long>{
    @Autowired
    DeptoRepository personaRepository;
    
    @Override
    public CrudRepository<Depto, Long> getDao() {
        return personaRepository;
    }
}
