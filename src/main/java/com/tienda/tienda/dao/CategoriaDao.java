/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.tienda.dao;


import com.tienda.tienda.domain.categoria;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author 50664
 */
public interface CategoriaDao extends JpaRepository<categoria, Long> {
    
}
