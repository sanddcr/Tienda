/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.tienda.service;

import com.tienda.tienda.domain.categoria;
import java.util.List;

/**
 *
 * @author 50664
 */
public interface CategoriaService {
    
    
    public List<categoria> getCategorias(boolean activos);
}
