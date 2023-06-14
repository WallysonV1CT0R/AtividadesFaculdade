package com.mycompany.ex2filas;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

class Cliente {
    int senha;
    String nome;
    int anoNascimento;

    public Cliente(int senha, String nome, int anoNascimento) {
        this.senha = senha;
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }
}

public class FilaAtendimento {
    private Queue<Cliente> filaPrioritaria;
    private Queue<Cliente> filaNormal;
    private int contadorPrioritario;

    public FilaAtendimento() {
        filaPrioritaria = new LinkedList<>();
        filaNormal = new LinkedList<>();
        contadorPrioritario = 0;
    }

    public void adicionarCliente(String nome, int anoNascimento) {
        int senha = filaPrioritaria.size() + filaNormal.size() + 1;
        Cliente cliente = new Cliente(senha, nome, anoNascimento);

        if (anoNascimento > 65) {
            filaPrioritaria.add(cliente);
            JOptionPane.showMessageDialog(null, "O cliente " + nome + " foi adicionado à fila prioritária.");
        } else {
            filaNormal.add(cliente);
            JOptionPane.showMessageDialog(null, "O cliente " + nome + " foi adicionado à fila normal.");
        }
    }

    public void chamarCliente() {
        if (contadorPrioritario < 2 && !filaPrioritaria.isEmpty()) {
            Cliente clientePrioritario = filaPrioritaria.poll();
            contadorPrioritario++;
            JOptionPane.showMessageDialog(null, "Cliente prioritário chamado: " + clientePrioritario.nome);
        } else if (!filaNormal.isEmpty()) {
            Cliente clienteNormal = filaNormal.poll();
            contadorPrioritario = 0;
            JOptionPane.showMessageDialog(null, "Cliente normal chamado: " + clienteNormal.nome);
        } else {
            JOptionPane.showMessageDialog(null, "Não há clientes na fila.");
        }
    }
}


