package com.mycompany.ex2filas;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        FilaAtendimento filaAtendimento = new FilaAtendimento();
        String opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                "Menu:\n" +
                "1 - Adicionar cliente\n" +
                "2 - Chamar cliente\n" +
                "0 - Sair\n" +
                "Escolha uma opção:"
            );

            switch (opcao) {
                case "1":
                    String nomeCliente = JOptionPane.showInputDialog("Informe o nome do cliente:");
                    int anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento do cliente:"));
                    filaAtendimento.adicionarCliente(nomeCliente, anoNascimento);
                    break;
                case "2":
                    filaAtendimento.chamarCliente();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (!opcao.equals("0"));
    }
}