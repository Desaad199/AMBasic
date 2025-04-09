/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jose.BaseProyectos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author desaa
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String displayHomePage(){
        return "/index";
    }
    @RequestMapping("/login")
    public String displayLogin(){
        return "/login";
    }
    
    @RequestMapping("/registro")
    public String displayFormRegistro(){
        return "/FormRegistroBean";
    }
}
