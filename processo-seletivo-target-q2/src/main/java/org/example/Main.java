package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if(Fibonacci.verificaValorSequencia(numero))
            System.out.println("Faz parte da sequência");
        else
            System.out.println("Não faz parte da sequência");
    }
}