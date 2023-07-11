/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.leccionm5b.evaluacion3M5B.model;

import java.util.List;
import lombok.Data;
import nonapi.io.github.classgraph.json.Id;
import org.springframework.data.mongodb.core.mapping.Document;
/*import org.springframework.data.annotation.Id;*/


/**
 * @author Raul
 */
@Document(collection = "Profesor")
@Data
public class Profesor {
    @Id
    private Long prof_id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Curso> listaCursos;
    private Depto depto;
}
