/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Beans;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

/**
 *
 * @author desaa
 */
@Getter
@Setter
@Component
@RequestScope
public class FormRegistroBean {
    private String nombre;
    private String apePat;
    private String apeMat;
    private String correoElectronico;
    private String edad;
    private String codigoPostal;
    private String password;
    private String direccion;
}
