/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Servicios;

import com.jose.BaseProyectos.Entities.Perfiles;
import com.jose.BaseProyectos.Objetos.Fechas;
import com.jose.BaseProyectos.Repositorios.RepoPerfiles;
import com.jose.BaseProyectos.Utilidades.Constantes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaa
 */
@Service
public class ServicePerfiles {
    @Autowired
    private RepoPerfiles repo;
    
    public Perfiles obtienePerfilCliente(){
        System.out.println(Fechas.momento()+" Buscando perfil");
        return this.repo.findById(Constantes.PERFIL_CLIENTE);
    }
}
