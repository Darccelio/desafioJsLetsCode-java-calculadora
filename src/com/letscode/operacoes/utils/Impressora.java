package com.letscode.operacoes.utils;

public class Impressora {

    private final static String MENSAGEM_ENTRADA_NUMERO = "Insira um numero: ";

    public static void imprimirEntradaValor(){
        System.out.print(MENSAGEM_ENTRADA_NUMERO);
    }

    public static void imprimirResultadoSoma(double num1, double num2, double soma) {
        System.out.printf("A soma de %.2f por %.2f é %.2f %n", num1, num2, soma);

    }

    public static void imprimirResultadoSubtracao(double num1, double num2, double subtracao) {
        System.out.printf("A subtração de %.2f por %.2f é %.2f %n", num1, num2, subtracao);

    }

    public static void imprimirResultadoDivisao(double num1, double num2, double divisao) {
        System.out.printf("A divisão de %.2f por %.2f é %.2f %n", num1, num2, divisao);

    }

    public static void imprimirResultadoMultiplicacao(double num1, double num2, double multiplicacao) {
        System.out.printf("A multiplicação de %.2f por %.2f é %.2f %n", num1, num2, multiplicacao);

    }


}
