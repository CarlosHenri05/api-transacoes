package br.com.testeitau.transacoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.testeitau.transacoes.model.Transacao;
import br.com.testeitau.transacoes.service.TransacaoService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;



@RestController
public class TransacaoController {

  
  protected final TransacaoService transacaoService;

  public TransacaoController(TransacaoService transacaoService) {
      this.transacaoService = transacaoService;
  }

  @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Transação concluída e dados criados."),
            @ApiResponse(responseCode = "400", description = "Requisição inválida."),
            @ApiResponse(responseCode = "409", description = "Conflito ao processar a transação."),
            @ApiResponse(responseCode = "422", description = "Transação não concluída, possivelmente erro com valores inválidos.")
    })

  @PostMapping("/transacao")
  public ResponseEntity<Transacao> postTransactionMethod(Transacao transacao) {
    
    return ResponseEntity.status(201).body(transacaoService.postTransaction(transacao));

  }




}
