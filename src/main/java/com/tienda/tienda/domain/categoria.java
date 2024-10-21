/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.domain;


import jakarta.persistence.*;
import java.io.Serializable;

import lombok.Data;

/**
 *
 * @author 50664
 */
@Data
@Entity
@Table (name="categoria")
public class categoria implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_categoria")
    private Long idCategoria;// interoretare como id_categoria
    private  String descripcion ;
    private String rutaImagen;
    private boolean activo;

    public categoria() {
    }

    public categoria( String descripcion, String rutaImagen, boolean activo) {
       
        this.descripcion = descripcion;
        this.rutaImagen = rutaImagen;
        this.activo = activo;
    }
    
    
    
    
}
