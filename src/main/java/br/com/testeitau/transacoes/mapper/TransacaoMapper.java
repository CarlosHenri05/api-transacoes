package br.com.testeitau.transacoes.mapper;

import br.com.testeitau.transacoes.dto.TransactionRequestDTO;
import br.com.testeitau.transacoes.dto.TransactionResponseDTO;
import br.com.testeitau.transacoes.model.Transacao;
import java.time.format.DateTimeFormatter;

public class TransacaoMapper {

  public Transacao toEntity(TransactionRequestDTO transactionRequestDTO) {
    Transacao transacao = new Transacao(transactionRequestDTO.getDataHora(), transactionRequestDTO.getValor());

    return transacao;
  }

  public static TransactionResponseDTO toResponseDTO (Transacao transacao){
      TransactionResponseDTO dto = new TransactionResponseDTO(transacao.getValor(), transacao.getDataHora().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME));
      return dto;
  }
}
