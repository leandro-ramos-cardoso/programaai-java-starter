package br.com.programeai.WithTeacher;

import java.util.Scanner;

public class ex001 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preco do produto: ");
        float precoProduto = scanner.nextFloat();

        System.out.println("Digite a quantidade do produto: ");
        int qtdProduto = scanner.nextInt();

        System.out.println("");
        System.out.println("INFORMACÕES DO PRODUTO");
        System.out.println("=======================");
        System.out.println("Nome do produto: " + nomeProduto);
        System.out.println("Preco do produto: R$ " + precoProduto);
        System.out.println("Quantidade de produto: " + qtdProduto);
    }
}
