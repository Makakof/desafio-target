package org.example;

public class InverteString
{
    public static String inverte(String stringAnterior)
    {
        char[] arrayAnterior, arrayNovo;

        arrayAnterior = stringAnterior.toCharArray();
        arrayNovo = new char[stringAnterior.length()];

        for(int i = 0; i < stringAnterior.length();i++)
        {
            arrayNovo[i] = arrayAnterior[arrayAnterior.length-i-1];
        }

        return new String(arrayNovo);
    }
}
