package com.example.lab6_gtics_20182693.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping({"/", "/inicio"})
    public String inicio() {
        return "inicio";
    }


    @GetMapping("/artistas")
    public String artistas() {
        return "artistas";
    }

    @GetMapping("/contactos")
    public String contactos() {
        return "contactos";
    }




}
