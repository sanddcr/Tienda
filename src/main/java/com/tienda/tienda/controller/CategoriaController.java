/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.tienda.tienda.controller;

import com.tienda.tienda.domain.categoria;
import com.tienda.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author 50664
 */
@Controller 
@RequestMapping("*/categoria")
public class CategoriaController {
    
    
    @Autowired
    CategoriaService categoriaService;
    
    @RequestMapping("/listado")
    public String inicio (Model model) {
        List<categoria> lista = categoriaService.getCategorias(false);
        model.addAttribute("categoria", lista);
        model.addAttribute("categoria", lista.size());

        return "/categoria/listado";
    }
    
}
