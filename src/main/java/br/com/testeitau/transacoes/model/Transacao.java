package br.com.testeitau.transacoes.model;

import java.time.OffsetDateTime;


public class Transacao {
  private OffsetDateTime dataHora;
  private double valor;

  public OffsetDateTime getDataHora() {
    return dataHora;
  }
  public void setDataHora(OffsetDateTime dataHora) {
    this.dataHora = dataHora;
  }
  public double getValor() {
    return valor;
  }
  public void setValor(double valor) {
    this.valor = valor;
  }
  
  public Transacao(OffsetDateTime dataHora, double valor) {
    this.dataHora = dataHora;
    this.valor = valor;
  }
  
  
  
}
