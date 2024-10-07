package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        String string;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra para ser invertida: ");
        string = scanner.nextLine();
        System.out.println("A palavra " + string.toUpperCase() + " invertida fica: ");
        string = InverteString.inverte(string);
        System.out.println(string);
    }
}