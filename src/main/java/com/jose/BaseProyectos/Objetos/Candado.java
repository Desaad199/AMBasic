/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Objetos;

import com.jose.BaseProyectos.Utilidades.Constantes;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author desaa
 */
public class Candado {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    
    public static String cerrar(String cadena) throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        System.out.println("cerrando cadena");
        Cipher cipher = Cipher.getInstance(Constantes.CIFRADO);
        cipher.init(Cipher.ENCRYPT_MODE, Constantes.obtenerLlave(), Constantes.obtenerDireccion());
        System.out.println("cadena cerrada");
        return Candado.cierraBase64(cipher.doFinal(Candado.abreBase64(cadena.getBytes()).getBytes()));
    }

    public static String abrir(String cadena) throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        System.out.println("abriendo cadena");
        Cipher cipher = Cipher.getInstance(Constantes.CIFRADO);
        cipher.init(Cipher.DECRYPT_MODE, Constantes.obtenerLlave(), Constantes.obtenerDireccion());
        System.out.println("cadena abierta");
        return Candado.abreBase64(cipher.doFinal(cadena.getBytes()));
    }

    public static String disuelvePassword(String password) {
        System.out.println(Fechas.momento()+" disolviendo password");
        return Candado.encoder.encode(Candado.abreBase64(password.getBytes()));
    }
    
    public static String abreBase64(byte[] cadena){
        System.out.println(Fechas.momento()+" Abriendo base 64");
        return new String(Base64.getDecoder().decode(cadena));
    }
    public static String cierraBase64(byte[] cadena){
        System.out.println(Fechas.momento()+" Abriendo base 64");
        return new String(Base64.getEncoder().encode(cadena));
    }
}
