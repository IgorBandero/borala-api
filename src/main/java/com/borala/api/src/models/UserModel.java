package com.borala.api.src.models;

import com.borala.api.src.dtos.UserDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "usuarios")
public class UserModel {

    public UserModel(UserDTO dto){
        this.nome = dto.getNome();
        this.email = dto.getEmail();
        //this.foto = dto.getFoto();
        this.senha = dto.getSenha();
        /*this.sobrenome = dto.getSobrenome();
        this.idade = dto.getIdade();
        this.cpf = dto.getCpf();
        this.cidade = dto.getCidade();
        this.telefone = dto.getTelefone();
        this.universidade = dto.getUniversidade();
        this.curso = dto.getCurso();
        this.interesses = dto.getInteresses();
        */
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    /* 
    @Column()
    private byte[] foto;
    */

    @Column(nullable = false)
    private String senha;

/* 
    @Column(nullable = false)
    private String sobrenome;

    @Column()
    private Integer idade;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column()
    private String cidade;

    @Column()
    private String telefone;

    @Column()
    private String universidade;

    @Column()
    private String curso;

    @Column()
    private String interesses;
*/
}
