/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos.Controllers;

import com.jose.BaseProyectos.Beans.FormRegistroBean;
import com.jose.BaseProyectos.Entities.Usuarios;
import com.jose.BaseProyectos.Objetos.Candado;
import com.jose.BaseProyectos.Objetos.Fechas;
import com.jose.BaseProyectos.Servicios.ServicePerfiles;
import com.jose.BaseProyectos.Servicios.ServiceUsuarios;
import com.jose.BaseProyectos.Utilidades.Constantes;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @author desaa
 */
@Controller
public class LoginController {

    @Autowired
    FormRegistroBean bfr;
    @Autowired
    ServiceUsuarios serviceUsuarios;
    @Autowired
    ServicePerfiles servicePerfiles;
//    FacesMessage mensaje;

    public void guardarRegistro() throws IllegalBlockSizeException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        //si el correo no existe, entonces se guarda el registro
        if(!serviceUsuarios.existeCorreo(Candado.cerrar(bfr.getCorreoElectronico()))){
            serviceUsuarios.guardarUsuario(new Usuarios(
                    Candado.cerrar(bfr.getCorreoElectronico()),
                    servicePerfiles.obtienePerfilCliente(),
                    Candado.cerrar(bfr.getNombre()),
                    Candado.cerrar(bfr.getApePat()),
                    Candado.cerrar(bfr.getApeMat()),
                    Integer.parseInt(this.bfr.getEdad()),
                    Candado.disuelvePassword(this.bfr.getPassword()),
                    Candado.cerrar(this.bfr.getDireccion()),
                    Integer.parseInt(this.bfr.getCodigoPostal()),
                    Fechas.momento()
            ));
        }
    }
}
