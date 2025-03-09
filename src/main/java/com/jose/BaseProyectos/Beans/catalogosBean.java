/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Beans;

import com.jose.BaseProyectos.Entities.Direccion;
import com.jose.BaseProyectos.Servicios.ServiceDireccion;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.util.ArrayList;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author desaa
 */
@Data
@Component
@SessionScoped
public class catalogosBean {
    private ArrayList<Direccion> listaDirecciones;
    
    @Autowired
    private ServiceDireccion sd;
    
    public ArrayList<Direccion> getListaDirecciones(){
        return sd.obtenerCatalogo();
    }
}
