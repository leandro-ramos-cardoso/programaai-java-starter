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

        switch (opcao) {
            case 1:
                System.out.println("Opcao selecionada: Agendar exames");
                break;
            case 2:
                System.out.println("Opcao selecionada: Receber resultados exames");
                break;
            case 3:
                System.out.println("Opcao selecionada: Emitir guia de exame");
                break;
            case 4:
                System.out.println("Opcao selecionada: Atendimento prioritário");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
