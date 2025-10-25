package br.com.programeai.MiniProjetos;

import java.util.Scanner;

public class Projeto07 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("");
        System.out.println("AUTO ATENDIMENTO");
        System.out.println("=======================");
        System.out.println("[1] - Agendar exames");
        System.out.println("[2] - Receber resultados exames");
        System.out.println("[3] - Emitir guia de exame");
        System.out.println("[4] - Atendimento prioritário");

        System.out.println("");
        System.out.println("Selecione uma opção: ");
        int opcao = input.nextInt();

        if(opcao == 1) {
            System.out.println("Opcao selecionada: Agendar exames");
        } else if (opcao == 2) {
            System.out.println("Opcao selecionada: Receber resultados exames");
        } else if (opcao == 3) {
            System.out.println("Opcao selecionada: Emitir guia de exame");
        } else if (opcao == 4) {
            System.out.println("Opcao selecionada: Atendimento prioritário");
        } else {
            System.out.println("Opcao invalida");
        }
    }
}
