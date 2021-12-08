package com.letscode.operacoes.utils;

import java.util.Scanner;

public class Leitor {

    private static Scanner sc = new Scanner(System.in);

    public static double scanearValores() {
        Impressora.imprimirEntradaValor();
        return sc.nextDouble();
    }



}
