package br.com.testeitau.transacoes.dto;

public class TransactionResponseDTO {
  
  private double valor;
  private String dataHora; 

  public double getValor() {
      return valor;
  }

  public void setValor(double valor) {
      this.valor = valor;
  }

  public String getDataHora() {
      return dataHora;
  }

  public void setDataHora(String dataHora) {
      this.dataHora = dataHora;
  }
}
