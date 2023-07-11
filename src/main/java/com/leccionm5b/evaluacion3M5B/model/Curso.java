/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leccionm5b.evaluacion3M5B.model;

import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author Raul
 */
@Document(collection="curso")
@Data
public class Curso {
    @Id
    private Long Curso_id;
    private Profesor Prof_id;
    private String nombre;
    private String nivel;
    private String descripcion;
}
