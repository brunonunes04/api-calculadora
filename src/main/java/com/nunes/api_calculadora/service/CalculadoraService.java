package com.nunes.api_calculadora.service;

import com.nunes.api_calculadora.dto.CalculadoraRequisicao;
import com.nunes.api_calculadora.dto.CalculadoraResposta;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public CalculadoraResposta Calculadora(CalculadoraRequisicao requisicao){
        return new CalculadoraResposta()

    }
}
