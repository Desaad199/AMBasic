/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Servicios;

import com.jose.BaseProyectos.Entities.Direccion;
import com.jose.BaseProyectos.Repositorios.RepoDireccion;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author desaa
 */
public class ServiceDireccion {
    @Autowired
    private RepoDireccion repo;
    
    public ArrayList<Direccion>obtenerCatalogo(){
        return this.repo.findAll();
    }
}
