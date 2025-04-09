/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Repositorios;

import com.jose.BaseProyectos.Entities.Usuarios;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author desaa
 */
public interface RepoUsuarios extends CrudRepository<Usuarios, Long> {
   Usuarios findByCorreoElectronico(String correoEletronico);
}
