package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DtoFaturamento> faturamentos;

        LeitorJson leitorJson = new LeitorJson();
        faturamentos = leitorJson.carregaArquivoJson();

        CalculaMetricas calculaMetricas = new CalculaMetricas(faturamentos);

        calculaMetricas.mostraRelatorio();

    }
}