package com.github.prehem.gs_5_ethical_recruiting.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@Tag(name = "Tema", description = "Informações sobre o tema do projeto GS2")
public class TemaController {

    @GetMapping("/info")
    @Operation(summary = "Retorna informações do tema e membros")
    public Map<String, String> getInfo() {
        return Map.of(
            "tema", "Sistemas de recrutamento ético e inclusivo com base em dados",
            "membro1", "Pedro Sodré",
            "membro2", "Miguel Stein",
            "descricao", "Plataforma que utiliza dados anonimizados e algoritmos éticos para conectar candidatos a vagas de forma inclusiva, eliminando vieses de gênero, raça ou origem. Promove diversidade nas contratações com transparência e auditoria de IA."
        );
    }
}