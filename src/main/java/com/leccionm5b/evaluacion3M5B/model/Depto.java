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
@Document(collection="depto")
@Data
public class Depto {
    @Id
    private Long Depto_id;
    private String nombre;
    private String Director;
    private String Descripcion;
}
