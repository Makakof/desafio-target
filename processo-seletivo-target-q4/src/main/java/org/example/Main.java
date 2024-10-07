package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String estado;
        Double valor;
        Scanner scanner = new Scanner(System.in);
        List<Faturamento> listaDeFaturamentos = new ArrayList<>();

        System.out.println("Insira os dados, quando quiser encerrar e ir para a próxima fase digite fim");
        do {
            System.out.println("Digite a sigla do estado: ");
            estado = scanner.next();

            System.out.println("Digite o faturamento: ");
            valor = scanner.nextDouble();

            Faturamento faturamentoDoMes = new Faturamento(estado,valor);
            listaDeFaturamentos.add(faturamentoDoMes);
        }while(!estado.equalsIgnoreCase("FIM"));

        Calcula realizaCalculos = new Calcula(listaDeFaturamentos);
        realizaCalculos.RelatorioPorPercentual();
    }
}