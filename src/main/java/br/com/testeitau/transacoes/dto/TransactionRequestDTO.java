package br.com.testeitau.transacoes.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.time.OffsetDateTime;

public class TransactionRequestDTO {

    @NotNull
    @Positive
    private Double valor;

    @NotNull
    private OffsetDateTime dataHora;

    // Getters e Setters
    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public OffsetDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(OffsetDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
