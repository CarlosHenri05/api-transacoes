package br.com.testeitau.transacoes.service;


import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.com.testeitau.transacoes.exceptions.TransactionException;
import br.com.testeitau.transacoes.model.Transacao;

@Service
public class TransacaoService {
  
  private final List<Transacao> transactionList = new ArrayList<>();


  public void postTransaction(Transacao transacao){
    OffsetDateTime now = OffsetDateTime.now();

    if(transacao.getValor() <= 0)
      throw new TransactionException("Transações só podem ter valor acima de 0.");

    if(transacao.getDataHora().isAfter(now))
      throw new TransactionException("Uma transação não pode ocorrer no futuro.");

    transactionList.add(transacao);
  }

  public void clearTransactions() {
    if(transactionList.size()<=0)
      throw new TransactionException("Não teve transações nos últimos tempos.");

    transactionList.clear();
  }

  public DoubleSummaryStatistics getLast60SecondsTransactionStatistics() {
      OffsetDateTime now = OffsetDateTime.now();
      if (transactionList.stream().anyMatch(transacao -> transacao == null)) 
          throw new TransactionException("A lista de transações contém valores nulos.");
      
      return transactionList.stream()
                            .filter(transaction -> transaction.getDataHora().isAfter(now.minusSeconds(60)))
                            .collect(Collectors.summarizingDouble(Transacao::getValor));
                            

    }

}
