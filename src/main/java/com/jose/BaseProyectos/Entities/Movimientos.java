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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *
 * @author desaa
 */
@Entity
@Data //libreria de lombook para los getters y setters
public class Movimientos implements Serializable{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    
    @ManyToOne
    TipoOperacion tipoOperacion;
    
    @ManyToOne
    MetodoPago metodoPago;
    
    @ManyToOne
    Direccion direccion;
    
    
    @Temporal(TemporalType.DATE) // solo almacena la fecha sin la hora
    Date fechaRegistro;
    String usuarioRegistra;
    String usuarioEdita;
    @Column(precision = 13, scale=4) // precision = total de digitos contando los decimales, scale = total de decimales
    BigDecimal importe;
    
    public void setImporte(String importe){
        this.importe = new BigDecimal(importe);
    }
    
    public String getImporte(){
        return this.importe.toString();
    }
    
    
}
