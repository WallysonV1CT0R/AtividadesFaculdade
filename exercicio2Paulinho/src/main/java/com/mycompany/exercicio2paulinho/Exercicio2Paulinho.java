package com.mycompany.exercicio2paulinho;

import javax.swing.JOptionPane;

public class Exercicio2Paulinho {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe um"
                + " numero(positivo) para calcular o fatorial"));
        if (num < 0) {
            JOptionPane.showMessageDialog(null, "O numero"
                    + " não pode ser negativo!");

        } else {
            long fatorial = calcularFatorial(num);
            JOptionPane.showMessageDialog(null, "O fatorial de "
                    + num + " é: " + fatorial);
        }
    }

    public static long calcularFatorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * calcularFatorial(num - 1);
        }
    }
}
