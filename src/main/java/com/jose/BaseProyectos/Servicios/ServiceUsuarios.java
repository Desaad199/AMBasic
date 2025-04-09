/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Servicios;

import com.jose.BaseProyectos.Entities.Usuarios;
import com.jose.BaseProyectos.Objetos.Fechas;
import com.jose.BaseProyectos.Repositorios.RepoUsuarios;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaa
 */
@Service
public class ServiceUsuarios {
    @Autowired
    private RepoUsuarios repo;
    
    public boolean existeCorreo(String correo){
        System.out.println(Fechas.momento()+" Buscando correo");
        return this.repo.findByCorreoElectronico(correo)!=null;
    }
    
    public void guardarUsuario(Usuarios usuario){
        this.repo.save(usuario);
        System.out.println(Fechas.momento()+" Usuario guardado correctamente");
    }
}
