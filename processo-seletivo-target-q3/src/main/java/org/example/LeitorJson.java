package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;


public class LeitorJson
{
    public List<DtoFaturamento> carregaArquivoJson() {
        String caminhoArquivo = "files/dados.json";
        ObjectMapper objectMapper = new ObjectMapper();

        List<DtoFaturamento> faturamentos;
        try {
            faturamentos = objectMapper.readValue(
                    new File(caminhoArquivo), new TypeReference<List<DtoFaturamento>>() {
                    }
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return faturamentos;
    }
}
