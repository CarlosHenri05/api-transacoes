package br.com.testeitau.transacoes.service;


import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import br.com.testeitau.transacoes.model.Transacao;

@Service
public class TransacaoService {
  
  List<Transacao> transactionList = new ArrayList<>();

  public void postTransaction(Transacao transacao){
    transactionList.add(transacao);
  }

  public void clearTransactions() {
    transactionList.clear();
  }

}
