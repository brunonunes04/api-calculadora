package com.nunes.api_calculadora.service;

import com.nunes.api_calculadora.dto.CalculadoraRequisicao;
import com.nunes.api_calculadora.dto.CalculadoraResposta;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public CalculadoraResposta Calculadora(String operacao, CalculadoraRequisicao requisicao) {

        int n1 = requisicao.getN1();
        int n2 = requisicao.getN2();
        double resultado;

        if ("adicao".equalsIgnoreCase(operacao)) {
            resultado = n1 + n2;

        } else if ("subtracao".equalsIgnoreCase(operacao)) {
            resultado = n1 - n2;

        } else if ("divisao".equalsIgnoreCase(operacao)) {
            if (n2 == 0) {
                throw new IllegalArgumentException(
                        "Não é possível dividir por 0."
                );
            }
            resultado = (double) n1 / n2;
        }

        else if ("multiplicacao".equalsIgnoreCase(operacao)) {
            resultado = n1 * n2;
        } else{
            throw new IllegalArgumentException(
                    "Operação Inválida" + operacao
            );
        }
        return new CalculadoraResposta(n1, n2, operacao, resultado);
    }
}
