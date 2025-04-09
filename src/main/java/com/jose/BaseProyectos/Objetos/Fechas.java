/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Objetos;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author desaa
 */
public class Fechas {
    private static Calendar calendario =  Calendar.getInstance();
    
    public static Date momento(){
        return calendario.getTime();
    }
}
