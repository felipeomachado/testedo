package br.com.felipeomachado.desafio1.controllers;

import br.com.felipeomachado.desafio1.entities.Modulo;
import br.com.felipeomachado.desafio1.repositories.ModuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ModulosController {

    @Autowired
    private ModuloRepository moduloRepository;

    @GetMapping
    public @ResponseBody Iterable<Modulo> listarModulos() {
        return moduloRepository.findAll();
    }
}

