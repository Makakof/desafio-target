package org.example;

public class Faturamento
{
    private Estado estado;
    private Double valor;

    Faturamento(String estado, Double valor)
    {
        this.setEstado(estado);
        this.valor = valor;
    }

    public Estado getEstado() {
        return estado;
    }

    public Double getValor() {
        return valor;
    }

    public void setEstado(String estado) {
        try {
            this.estado = Estado.valueOf(estado.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.err.println("Estado inválido: " + estado);
        } catch (NullPointerException e) {
            System.err.println("Estado não pode ser nulo.");
        }
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
