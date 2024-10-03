package com.example.lab6_gtics_20182693.controller;

import com.example.lab6_gtics_20182693.entity.Evento;
import com.example.lab6_gtics_20182693.repository.EventoRepository;
import jdk.jfr.Event;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.text.ParseException;
import java.util.Optional;



@RequestMapping("/eventos")
@Controller
public class EventoController {

    private final EventoRepository eventoRepository;

    public EventoController(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    @GetMapping(value = {"", "/", "list"})
    public String eventos(Model model) {
        model.addAttribute("listaEmpleados", eventoRepository.findAll());

        return "eventos";
    }


    @GetMapping("/nuevo")
    public String nuevoEventoFrm(Model model) {
        model.addAttribute("Evento", new Evento());


        return "/eventoNuevo";
    }

    @PostMapping("/guardar")
    public String guardarEvento(Evento evento,  @RequestParam("fecha") String fecha) {


        try {
            evento.setFecha(formatter.parse(fecha));

        } catch (ParseException e) {
            e.printStackTrace();
        }

        eventoRepository.save(evento);
        return "redirect:/eventos";
    }

    @GetMapping("/producto/editar")
    public String editarProducto(Model model, @RequestParam("id") int id) {

        public String editarEmpleado (Model model,@RequestParam("id") int id){
            Optional<Evento> optional = eventoRepository.findById(id);

            if (optional.isPresent()) {

                return "/eventoEditar";
            } else {
                return "redirect:/employee";
            }
        }
    }}
