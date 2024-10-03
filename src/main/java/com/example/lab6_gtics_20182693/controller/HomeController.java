package com.example.lab6_gtics_20182693.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "redirect:/artistas";
    }


    @GetMapping("/artistas")
    public String artistas() {
        return "artistas";
    }

    @GetMapping("/contactos")
    public String contactos() {
        return "contactos";
    }

    @GetMapping("/eventos")
    public String eventos() {
        return "eventos";
    }


}
