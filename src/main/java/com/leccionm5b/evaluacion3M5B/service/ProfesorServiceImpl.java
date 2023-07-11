/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leccionm5b.evaluacion3M5B.service;

import com.leccionm5b.evaluacion3M5B.model.Profesor;
import com.leccionm5b.evaluacion3M5B.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Raul
 */
@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements GenericService<Profesor, Long>{
    @Autowired
    ProfesorRepository personaRepository;
    
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return personaRepository;
    }
}