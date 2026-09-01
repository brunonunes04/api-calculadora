package com.nunes.api_calculadora.dto;

public class CalculadoraResposta {
    private int n1;
    private int n2;
    private String operacao;
    private double resposta;

    public CalculadoraResposta(){};
    public CalculadoraResposta(int n1, int n2,String operacao,double resposta) {
        this.resposta = resposta;
        this.operacao = operacao;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public double getResposta() {
        return resposta;
    }

    public void setResposta(double resposta) {
        this.resposta = resposta;
    }

    public String getOperacao() {
        return operacao;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }
}
