package br.com.programeai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.print("Olá ");
//        System.out.println("Mundo");
//        System.out.println("Bem vindo ao curso Java!");
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.printf("Olá %s você tem %d anos e tem %.2f de altura.", nome, idade, altura);

        input.close();
    }
}