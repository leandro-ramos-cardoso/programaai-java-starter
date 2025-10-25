package br.com.programeai.MiniProjetos;

import java.util.Scanner;

public class Projeto01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("MINI PROJETO 01");
        System.out.println("=======================");

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preco do produto: ");
        float precoProduto = scanner.nextFloat();

        System.out.println("Digite a quantidade do produto: ");
        int quantidadeProduto = scanner.nextInt();

        float valorTotal = precoProduto * quantidadeProduto;

        System.out.println("");
        System.out.println("INFORMACÕES DO PRODUTO");
        System.out.println("=======================");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Quantidade de itens no estoque: " + quantidadeProduto);
        System.out.println("Valor total da compra: R$ " + valorTotal);
    }
}
