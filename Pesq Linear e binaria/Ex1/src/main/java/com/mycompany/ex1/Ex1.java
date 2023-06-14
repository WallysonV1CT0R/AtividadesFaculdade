package com.mycompany.ex1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
        int quantidadeNumeros = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe a quantidade de números a serem cadastrados:"));
        int[] numeros = new int[quantidadeNumeros];

        JOptionPane.showMessageDialog(null, "Informe os"
                + " números em ordem crescente:");
        for (int i = 0; i < quantidadeNumeros; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Número "
                    + (i + 1) + ":"));
        }

        Arrays.sort(numeros); // Ordena os números em ordem crescente

        String[] opcoes = { "Pesquisa Linear", "Pesquisa Binária" };
        int opcao = JOptionPane.showOptionDialog(
            null,
            "Escolha o tipo de pesquisa:",
            "Menu",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            opcoes,
            opcoes[0]
        );

        int numeroPesquisado = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe o número a ser pesquisado:"));

        boolean encontrado = false;
        int indiceEncontrado = -1;

        if (opcao == 0) { // Pesquisa Linear
            for (int i = 0; i < quantidadeNumeros; i++) {
                if (numeros[i] == numeroPesquisado) {
                    encontrado = true;
                    indiceEncontrado = i;
                    break;
                }
            }
        } else if (opcao == 1) { // Pesquisa Binária
            int inicio = 0;
            int fim = quantidadeNumeros - 1;

            while (inicio <= fim) {
                int meio = (inicio + fim) / 2;

                if (numeros[meio] == numeroPesquisado) {
                    encontrado = true;
                    indiceEncontrado = meio;
                    break;
                } else if (numeros[meio] < numeroPesquisado) {
                    inicio = meio + 1;
                } else {
                    fim = meio - 1;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null,
                    "Opção inválida. Encerrando o programa.");
            System.exit(0);
        }

        if (encontrado) {
            JOptionPane.showMessageDialog(null, "O número " + 
                    numeroPesquisado + " foi encontrado no índice "
                    + indiceEncontrado);
        } else {
            JOptionPane.showMessageDialog(null, "O número " + 
                    numeroPesquisado + " não foi encontrado na lista.");
        }
    }
}
