package br.com.testeitau.transacoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.testeitau.transacoes.model.Transacao;
import br.com.testeitau.transacoes.service.TransacaoService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;



@RestController
@RequestMapping("/")
public class TransacaoController {

  
  protected final TransacaoService transacaoService;

  public TransacaoController(TransacaoService transacaoService) {
      this.transacaoService = transacaoService;
  }

  // @Operation (summary = "Realizar transações")
  // @ApiResponses(value = {
  //           @ApiResponse(responseCode = "201", description = "Transação concluída e dados criados."),
  //           @ApiResponse(responseCode = "400", description = "Requisição inválida."),
  //           @ApiResponse(responseCode = "409", description = "Conflito ao processar a transação."),
  //           @ApiResponse(responseCode = "422", description = "Transação não concluída, possivelmente erro com valores inválidos.")
  //   })

  

  



}
