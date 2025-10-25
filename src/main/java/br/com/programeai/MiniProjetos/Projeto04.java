package br.com.programeai.MiniProjetos;

import java.util.Scanner;

public class Projeto04 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("INFORMACÕES DO USUÁRIO");
        System.out.println("=======================");

        System.out.println("User: ");
        String user = input.nextLine();

        System.out.println("Password: ");
        String password = input.nextLine();

        if(user.equals("Higor") && password.equals("123")){
            System.out.println("User logado com sucesso!");
            System.out.println("Bem vindo " + user);
        }

    }
}
