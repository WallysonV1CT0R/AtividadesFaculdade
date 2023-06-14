
package com.mycompany.ex2;


class Cliente implements Comparable<Cliente> {
    int codigo;
    String nome;
    String dataNascimento;
    String cpf;

    public Cliente(int codigo, String nome, String dataNascimento, String cpf) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
    }

    @Override
    public int compareTo(Cliente outroCliente) {
        return Integer.compare(this.codigo, outroCliente.codigo);
    }
}
