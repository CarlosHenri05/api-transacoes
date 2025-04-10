import br.com.testeitau.transacoes.dto.TransactionRequestDTO;
import br.com.testeitau.transacoes.dto.TransactionResponseDTO;
import br.com.testeitau.transacoes.model.Transacao;

public class TransacaoMapper {

  public Transacao toEntity(TransactionRequestDTO transactionRequestDTO) {
    Transacao transacao = new Transacao(transactionRequestDTO.getDataHora(), transactionRequestDTO.getValor());

    return transacao;
  }

  public static TransactionResponseDTO toResponseDTO (Transacao transacao){
      TransactionResponseDTO dto = new TransactionResponseDTO(dto.getDataHora().format(DateTimeFormatter.ISO_OFFSET_DATE_TIME),dto.getValor());

      return dto;
  }
}
