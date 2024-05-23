package com.borala.api.src.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class MailDTO {
    
    @NotBlank(message = "Nome é obrigatório!")
    private String nome;

    @NotBlank(message = "E-mail obrigatório!")
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "E-mail inválido!")
    private String email;

    private String assunto;

    @NotBlank(message = "Mensagem vazia!")
    private String mensagem;
}
