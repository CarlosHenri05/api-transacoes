package br.com.testeitau.transacoes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
   @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API de Transações")
                .version("1.0")
                .description("API desenvolvida para o teste técnico da empresa Itaú, cujo objetivo é simular transações e retornar suas estatísticas (mais especificamente, estatísticas de transações até 60 segundos atrás)"));
    }
}
