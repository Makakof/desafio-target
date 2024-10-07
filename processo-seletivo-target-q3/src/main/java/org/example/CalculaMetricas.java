package org.example;

import java.util.List;

public class CalculaMetricas
{
    private List<DtoFaturamento> faturamentos;
    CalculaMetricas(List<DtoFaturamento> novosFaturamentos)
    {
        this.faturamentos = novosFaturamentos;
    }

    public Double buscaMenorFaturamento()
    {
        Double menorValor = this.faturamentos.get(0).valor();

        for(DtoFaturamento faturamento : this.faturamentos)
        {
            if(faturamento.valor() < menorValor && faturamento.valor() != 0.0)
                menorValor = faturamento.valor();
        }

        return menorValor;
    }

    public Double buscaMaiorFaturamento()
    {
        Double maiorValor = this.faturamentos.get(0).valor();

        for(DtoFaturamento faturamento : this.faturamentos)
        {
            if(faturamento.valor() > maiorValor)
                maiorValor = faturamento.valor();
        }

        return maiorValor;
    }

    public Double calculaMediaMensal()
    {
        Double soma = 0.0;
        for(DtoFaturamento faturamento : this.faturamentos)
            soma += faturamento.valor();

        return soma / this.faturamentos.size();
    }

    public int calculaDiasAcimaDaMediaMensal()
    {
        int qtdDiasAcimaDaMedia = 0;
        Double mediaMensal = this.calculaMediaMensal();

        for(DtoFaturamento faturamento : this.faturamentos)
        {
            if(faturamento.valor() > mediaMensal)
                qtdDiasAcimaDaMedia++;
        }

        return qtdDiasAcimaDaMedia;

    }

    public void mostraRelatorio()
    {
        System.out.println("O valor do menor faturamento do mês foi: " + this.buscaMenorFaturamento());
        System.out.println("O valor do maior faturamento do mês foi: " + this.buscaMaiorFaturamento());
        System.out.println("A quantidade de dias que o faturamento foi maior que a média foi de: " +
                this.calculaDiasAcimaDaMediaMensal() + " dias");
    }
}
