/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Utilidades;

import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author desaa
 */
public abstract class Constantes {

    private static final String SECRET_KEY = "12345678901234567890123456789012"; // 32 bytes para AES-256
    private static final String INIT_VECTOR = "1234567890123456"; // 16 bytes para IV
    public static final String CIFRADO = "AES/CBC/PKCS5Padding";
    public static final int PERFIL_CLIENTE=2;
    public static final int PERFIL_GESTOR=1;

    public static SecretKey obtenerLlave() {
        return new SecretKeySpec(SECRET_KEY.getBytes(), "AES");
    }

    public static IvParameterSpec obtenerDireccion() {
        return new IvParameterSpec(INIT_VECTOR.getBytes());
    }
}
