package com.letscode.operacoes;

import com.letscode.operacoes.service.Operacoes;
import com.letscode.operacoes.utils.Impressora;
import com.letscode.operacoes.utils.Leitor;

public class Main {

    public static void main(String[] args) {
	// write your code here

        double numero1 = Leitor.scanearValores();
        double numero2 = Leitor.scanearValores();

        double soma = Operacoes.somar(numero1, numero2);
        double subtracao  = Operacoes.subtrair(numero1, numero2);
        double multiplicacao = Operacoes.multiplicar(numero1, numero2);
        double divisao = Operacoes.dividir(numero1, numero2);


//        System.out.printf("A soma de %.2f por %.2f é %.2f %n");
        tratarImpressoes(numero1, numero2, soma, subtracao, multiplicacao, divisao);

    }

    private static void tratarImpressoes(double numero1, double numero2, double soma, double subtracao, double multiplicacao, double divisao) {
        Impressora.imprimirResultadoSoma(numero1, numero2, soma);
        Impressora.imprimirResultadoSubtracao(numero1, numero2, subtracao);
        Impressora.imprimirResultadoMultiplicacao(numero1, numero2, multiplicacao);
        Impressora.imprimirResultadoDivisao(numero1, numero2, divisao);
    }
}
