package com.mycompany.exercicio1paulinho;

public class Exercicio1Paulinho {

    public static void main(String[] args) {
        int resultado = res(0, 50);
        System.out.println("A soma dos numeros de 0 50 é de: " + resultado);
    }

    public static int res(int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        } else {
            return inicio + res(inicio + 1, fim);
        }
    }
}
