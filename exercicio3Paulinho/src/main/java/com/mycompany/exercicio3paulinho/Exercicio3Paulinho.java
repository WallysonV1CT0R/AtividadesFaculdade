package com.mycompany.exercicio3paulinho;

import javax.swing.JOptionPane;

public class Exercicio3Paulinho {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Informe"
                + " um número(positivo):"));
        if (num < 0) {
            JOptionPane.showMessageDialog(null, "O número"
                    + " não pode ser negativo!");
        } else {
            System.out.println("Sequencia Fibonacci até " + num + ":");
            for (int i = 0; calcFibonacci(i) <= num; i++) {
                System.out.print(calcFibonacci(i) + ", ");

            }
        }
    }

    public static int calcFibonacci(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1 || num == 2) {
            return 1;
        } else {
            return calcFibonacci(num - 1) + calcFibonacci(num - 2);
        }

    }
}
