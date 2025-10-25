package br.com.programeai.Alone;

import java.util.Scanner;

public class ex003 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = input.nextLine();

        System.out.println("Digite a quantidade de itens do produto: ");
        int quantidadeProduto = input.nextInt();

        System.out.println("");
        System.out.println("INFORMACÕES DO PRODUTO");
        System.out.println("=======================");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Quantidade de itens no estoque: " + quantidadeProduto);
    }
}
