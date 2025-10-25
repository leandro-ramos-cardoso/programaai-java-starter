package br.com.programeai.WithTeacher;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("COMPARAÇÃO DE NÚMEROS");
        System.out.println("=======================");

        System.out.println("Digite o primeiro número: ");
        int numero01 = scanner.nextInt();

        System.out.println("Digite o segundo número");
        int numero02 = scanner.nextInt();

        if (numero01 == numero02) {
            System.out.printf("%d é igual a %d", numero01, numero02);
        } else{
            System.out.printf("%d é diferente de %d", numero01, numero02);
        }
    }
}
