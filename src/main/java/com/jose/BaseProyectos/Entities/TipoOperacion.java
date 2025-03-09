/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import lombok.Data;

/**
 *
 * @author desaa
 */
@Entity
@Data //libreria de lombook para los getters y setters
public class TipoOperacion implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String descripcion;
    @Temporal(TemporalType.DATE) // solo almacena la fecha sin la hora
    Date fechaRegistro;
    String usuarioRegistra;
    String usuarioEdita;   
    
    @OneToMany(mappedBy="tipoOperacion")
    Set<Movimientos> movimiento;
}
