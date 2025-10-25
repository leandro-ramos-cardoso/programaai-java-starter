package br.com.programeai.MiniProjetos;

import java.util.Scanner;

public class Projeto08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("INFORMACÕES DO USUÁRIO");
        System.out.println("=======================");

        System.out.println("User: ");
        String user = input.nextLine();

        System.out.println("Password: ");
        String password = input.nextLine();

        int opcaoSelecionada;
        if (user.equalsIgnoreCase("HIGOR") && password.equals("123")) {
            System.out.println("User logado com sucesso!");
            System.out.println("Bem vindo " + user);

            System.out.println("[1] - Adicionar Produto");
            System.out.println("[2] - Listar Produto");
            System.out.println("[3] - Realizar Pagamento");
            System.out.println("[4] - Cadastrar Cliente");

            System.out.println("");
            System.out.println("MENU DO SISTEMA");
            System.out.println("----------------");

            System.out.println("Digite uma opcao: ");
            opcaoSelecionada = input.nextInt();
        } else {
            System.out.println("Credenciais invalidas");
            return;
        }

        if (opcaoSelecionada == 1) {
            System.out.println("Opcao selecionada: Adicionar Produto");
        } else if (opcaoSelecionada == 2) {
            System.out.println("Opcao selecionada: Listar Produto");
        } else if (opcaoSelecionada == 3) {
            System.out.println("Opcao selecionada: Realizar Pagamento");
        } else if (opcaoSelecionada == 4) {
            System.out.println("Opcao selecionada: Cadastrar Cliente");
        } else {
            System.out.println("Opcao inválida");
        }
    }
}
