package com.nunes.api_calculadora.controller;

import com.nunes.api_calculadora.dto.CalculadoraRequisicao;
import com.nunes.api_calculadora.dto.CalculadoraResposta;
import com.nunes.api_calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {

    @Autowired
    CalculadoraService service;

    @PostMapping("/calculadora/{operacao}")
    public CalculadoraResposta Calculadora (@PathVariable String operacao, @RequestBody CalculadoraRequisicao requisicao){
        return service.Calculadora(operacao, requisicao);
    }



}
