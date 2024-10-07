package org.example;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Calcula
{
    private Double faturamentoTotalMensal;

    private List<Faturamento> listaDeFaturamentosPorEstado = new ArrayList<>();

    Calcula(List<Faturamento> listaDeFaturamentosPorEstado)
    {
        this.listaDeFaturamentosPorEstado = listaDeFaturamentosPorEstado;
        this.faturamentoTotalMensal = this.calculaFaturamentoToal();
    }

    public Double getFaturamentoTotalMensal() {
        return faturamentoTotalMensal;
    }

    public List<Faturamento> getListaDeFaturamentosPorEstado() {
        return listaDeFaturamentosPorEstado;
    }

    private Double calculaFaturamentoToal()
    {
        Double soma = 0.0;

        for(Faturamento faturamento : this.listaDeFaturamentosPorEstado)
            soma += faturamento.getValor();

        return soma;
    }

    public Double calculaPercentual(Double valor)
    {
        return (valor / this.faturamentoTotalMensal) * 100;
    }

    public void RelatorioPorPercentual()
    {
        for(Faturamento faturamento : this.listaDeFaturamentosPorEstado)
        {
            System.out.println("Estado: " + faturamento.getEstado());
            System.out.println("Percentual do faturamento: " + this.calculaPercentual(faturamento.getValor()));
        }
    }
}
