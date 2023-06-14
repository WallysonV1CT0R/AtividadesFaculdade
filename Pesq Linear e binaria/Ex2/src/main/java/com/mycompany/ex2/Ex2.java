package com.mycompany.ex2;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Ex2 {

    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();

        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "Menu:\n" +
                "1 - Cadastrar cliente\n" +
                "2 - Pesquisar cliente\n" +
                "0 - Sair\n" +
                "Escolha uma opção:"
            ));

            switch (opcao) {
                case 1:
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente:"));
                    String nome = JOptionPane.showInputDialog("Informe o nome:");
                    String dataNascimento = JOptionPane.showInputDialog("Informe o ano de nascimento:");
                    String cpf = JOptionPane.showInputDialog("Informe o CPF:");

                    Cliente cliente = new Cliente(codigo, nome, dataNascimento, cpf);
                    listaClientes.add(cliente);
                    Collections.sort(listaClientes); // Ordena a lista de clientes pelo código
                    JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
                    break;
                case 2:
                    int codigoPesquisa = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cliente a ser pesquisado:"));
                    Cliente clienteEncontrado = pesquisarCliente(listaClientes, codigoPesquisa);

                    if (clienteEncontrado != null) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Dados do cliente:\n" +
                            "Código: " + clienteEncontrado.codigo + "\n" +
                            "Nome: " + clienteEncontrado.nome + "\n" +
                            "Ano Nascimento: " + clienteEncontrado.dataNascimento + "\n" +
                            "CPF: " + clienteEncontrado.cpf
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                    }
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Encerrando o programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);
    }

    private static Cliente pesquisarCliente(ArrayList<Cliente> listaClientes, int codigoPesquisa) {
        int inicio = 0;
        int fim = listaClientes.size() - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;
            Cliente clienteMeio = listaClientes.get(meio);

            if (clienteMeio.codigo == codigoPesquisa) {
                return clienteMeio;
            } else if (clienteMeio.codigo < codigoPesquisa) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }

        return null;
    }
}

