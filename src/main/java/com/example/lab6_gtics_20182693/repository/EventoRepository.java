package com.example.lab6_gtics_20182693.repository;

import com.example.lab6_gtics_20182693.entity.Evento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository {

List<Evento> findAll();
List<Evento> findById(int eventoId);
}


