package org.example;

public class Fibonacci
{
    public static boolean verificaValorSequencia(int numero)
    {
        int ultimoTermo = 0, penultimoTermo = 1;

        while(ultimoTermo < numero)
        {
            int termoAtual = ultimoTermo + penultimoTermo;
            ultimoTermo = penultimoTermo;
            penultimoTermo = termoAtual;
        }

        return ultimoTermo == numero;
    }
}
