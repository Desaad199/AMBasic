/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Getter;
import jakarta.persistence.Table;
import lombok.Setter;
/**
 *
 * @author desaa
 */
@Entity
@Getter //libreria de lombook para los getters y setters
@Setter
@Table(name="utc_perfiles")
public class Perfiles implements Serializable{
    @Id
    private int id;
    private String descripcion;
}
