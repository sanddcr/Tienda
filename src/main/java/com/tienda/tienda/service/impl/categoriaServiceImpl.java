 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.tienda.service.impl;

import com.tienda.tienda.dao.CategoriaDao;
import com.tienda.tienda.domain.categoria;
import com.tienda.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 50664
 */
@Service
public class categoriaServiceImpl implements CategoriaService{
    @Autowired
    private CategoriaDao categoriaDao;
            
    @Override
    public List<categoria> getCategorias(boolean activos) {
        List<categoria> lista = categoriaDao.findAll();
        
        if(activos){
            //remueve de l;a lista los elementos donde 
            // el atributo de la lista es falso 
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }
}
