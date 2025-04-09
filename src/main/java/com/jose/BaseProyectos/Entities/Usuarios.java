/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author desaa
 */
@Entity
@Getter //libreria de lombook para los getters y setters
@Setter
@Table(name="utr_usuarios")
public class Usuarios implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="correo_electronico")
    private String correoElectronico;
    @ManyToOne(fetch = FetchType.LAZY) // Relación unidireccional
    @JoinColumn(name = "id_perfil", nullable = false) // Clave foránea en Usuario
    private Perfiles perfil;
    @Column(name="nombres")
    private String nombres;
    @Column(name="ape_pat")
    private String apellidoPaterno;
    @Column(name="ape_mat")
    private String apellidoMaterno;
    @Column(name="edad")
    private int edad;
    @Column(name="password")
    private String password;
    @Column(name="direccion")
    private String direccion;
    @Column(name="codigo_postal")
    private int codigoPostal;
    @Temporal(TemporalType.DATE) // solo almacena la fecha sin la hora
    @Column(name="fecha_registro")
    private Date fechaRegistro;
    
    public Usuarios(String correoElectronico, Perfiles perfil,String nombres, String apellidoPaterno, String apellidoMaterno, int edad, String password, String direccion, int codigoPostal ,Date fechaRegistro){
        this.correoElectronico = correoElectronico;
        this.perfil = perfil;
        this.nombres = nombres;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.password = password;
        this.direccion = direccion;
        this.codigoPostal = codigoPostal;
        this.fechaRegistro = fechaRegistro;
    }
    
}
