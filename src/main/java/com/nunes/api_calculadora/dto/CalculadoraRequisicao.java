package com.nunes.api_calculadora.dto;

public class CalculadoraRequisicao {

     private int n1;
     private int n2;

     private String adicao;
     private String subtracao;
     private String divisao;
     private String multiplicacao;


    public CalculadoraRequisicao(int n2, int n1, String adicao, String subtracao, String divisao, String multiplicacao) {
        this.n2 = n2;
        this.n1 = n1;
        this.adicao = adicao;
        this.subtracao = subtracao;
        this.divisao = divisao;
        this.multiplicacao = multiplicacao;
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

    public String getAdicao() {
        return adicao;
    }

    public void setAdicao(String adicao) {
        this.adicao = adicao;
    }

    public String getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(String subtracao) {
        this.subtracao = subtracao;
    }

    public String getDivisao() {
        return divisao;
    }

    public void setDivisao(String divisao) {
        this.divisao = divisao;
    }

    public String getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(String multiplicacao) {
        this.multiplicacao = multiplicacao;
    }
}
