package com.borala.api.src.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    
    @NotBlank(message = "Nome de usuário é obrigatório!")
    private String nome;

    private String sobrenome;
    private Integer idade;

    @NotBlank(message = "CPF é obrigatório!")
    @Size(min = 11, max = 11)
    private String cpf;

    private String email;

    @NotBlank(message = "Senha é obrigatória!")
    @Size(min = 8)
    private String senha;

    private String cidade;
    private String telefone;
    private String universidade;
    private String curso;
    private String interesses;
    private byte[] foto;
}
