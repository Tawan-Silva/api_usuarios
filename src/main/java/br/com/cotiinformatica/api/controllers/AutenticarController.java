package br.com.cotiinformatica.api.controllers;

import br.com.cotiinformatica.application.dtos.AtualizarDadosDTO;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutenticarController {

    @PostMapping("/api/usuarios/autenticar")
    public String post(@Valid @RequestBody AtualizarDadosDTO dto) {
        return null;
    }
}
