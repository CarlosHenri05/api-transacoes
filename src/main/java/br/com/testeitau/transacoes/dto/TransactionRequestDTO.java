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

    public TransactionRequestDTO(@NotNull @Positive Double valor, @NotNull OffsetDateTime dataHora) {
      this.valor = valor;
      this.dataHora = dataHora;
    }

    
}
