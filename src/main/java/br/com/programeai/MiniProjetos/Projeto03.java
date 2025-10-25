package br.com.programeai.MiniProjetos;

import java.util.Scanner;

public class Projeto03 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("INFORMACÕES DO USUÁRIO");
        System.out.println("=======================");

        System.out.println("Digite o nome do usuário: ");
        String nomeUser = scanner.nextLine();

        System.out.println("Digite a senha do usuário: ");
        String password = scanner.nextLine();

        if(nomeUser.equals("higor")){
            System.out.println("Usuário: " + nomeUser + " logado com sucesso");
        } else {
            System.out.println("Usuário ou senha incorretas");
        }
    }
}


