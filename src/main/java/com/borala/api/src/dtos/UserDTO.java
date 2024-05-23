package com.borala.api.src.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class UserDTO {
    
    @NotBlank(message = "Nome é obrigatório!")
    private String nome;

    @NotBlank(message = "E-mail é obrigatório!")
    //@Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$", message = "E-mail inválido!")
    private String email;

    //private byte[] foto;

    @NotBlank(message = "Senha é obrigatória!")
    @Size(min = 8)
    private String senha;
/* 
    private String sobrenome;
    private Integer idade;
    @NotBlank(message = "CPF é obrigatório!")
    @Size(min = 11, max = 11)
    private String cpf;
    private String cidade;
    private String telefone;
    private String universidade;
    private String curso;
    private String interesses;   
*/
}
