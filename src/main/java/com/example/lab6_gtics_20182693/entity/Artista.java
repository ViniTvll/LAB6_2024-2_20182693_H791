package com.example.lab6_gtics_20182693.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "artistas")
@Getter
@Setter
public class Artista{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "artistaId")
    private int artistaId;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String genero;
    @Column(nullable = false)
    private String telefono;

}
