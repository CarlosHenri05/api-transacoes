package br.com.testeitau.transacoes.controller;

import java.util.DoubleSummaryStatistics;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.testeitau.transacoes.dto.TransactionRequestDTO;
import br.com.testeitau.transacoes.mapper.TransacaoMapper;
import br.com.testeitau.transacoes.model.Transacao;
import br.com.testeitau.transacoes.service.TransacaoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;



@RestController
@RequestMapping("/")
public class TransacaoController {

  
  protected final TransacaoService transacaoService;

  public TransacaoController(TransacaoService transacaoService) {
      this.transacaoService = transacaoService;
  }

  
  @Operation (summary = "Realizar transações")
  @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Transação concluída e dados criados."),
            @ApiResponse(responseCode = "400", description = "Requisição inválida."),
            @ApiResponse(responseCode = "409", description = "Conflito ao processar a transação."),
            @ApiResponse(responseCode = "422", description = "Transação não concluída, possivelmente erro com valores inválidos.")
    })

  @PostMapping("/transacao")
  public ResponseEntity<Void> postTransactionHTTPSMethod(@RequestBody TransactionRequestDTO transactionDTO) {
    Transacao transacao = TransacaoMapper.toEntity(transactionDTO);

    transacaoService.postTransaction(transacao);

    return ResponseEntity.status(201).build();

  }

  @Operation (summary = "Deletar todas as transações")
  @DeleteMapping("/transacoes")
  public ResponseEntity<Void> deleteTransactionsHTTPSMethod() {
    transacaoService.clearTransactions();

    return ResponseEntity.noContent().build();
  }

  @Operation (summary = "Retornar dados baseados em estatísticas das transações")
  @GetMapping("/estatisticas")
  public ResponseEntity<DoubleSummaryStatistics> getLast60SecondsTransactionsStatisticsHTTPSMethod(){

    return ResponseEntity.ok(transacaoService.getLast60SecondsTransactionStatistics());
  }
  

  

  



}
