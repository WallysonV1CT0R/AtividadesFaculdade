package com.mycompany.ex1filas;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

public class Ex1Filas {

    private Queue<String> fila;

    public Ex1Filas() {
        fila = new LinkedList<>();
    }

    public void adicionarPaciente(String nome) {
        if (fila.size() >= 20) {
            JOptionPane.showMessageDialog(null, "A capacidade"
                    + " da fila foi atingida. Por favor, aguarde.");
        } else {
            fila.add(nome);
            JOptionPane.showMessageDialog(null, "O paciente " +
                    nome + " foi adicionado à fila.");
        }
    }

    public void chamarProximoPaciente() {
        if (!fila.isEmpty()) {
            String proximoPaciente = fila.poll();
            JOptionPane.showMessageDialog(null, "Próximo paciente:"
                    + " " + proximoPaciente);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Não há pacientes na fila.");
        }
    }

    public static void main(String[] args) {
        Ex1Filas filaClinica = new Ex1Filas();
        String opcao;

        do {
            opcao = JOptionPane.showInputDialog(
                "Menu:\n" +
                "1 - Adicionar paciente\n" +
                "2 - Chamar próximo paciente\n" +
                "0 - Sair\n"
                
            );

            switch (opcao) {
                case "1":
                    String nomePaciente = JOptionPane.showInputDialog
                    ("Informe o nome do paciente:");
                    filaClinica.adicionarPaciente(nomePaciente);
                    break;
                case "2":
                    filaClinica.chamarProximoPaciente();
                    break;
                case "0":
                    JOptionPane.showMessageDialog(null,
                            "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
              "Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (!opcao.equals("0"));
    }
}

