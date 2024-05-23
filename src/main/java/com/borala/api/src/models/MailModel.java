package com.borala.api.src.models;

import com.borala.api.src.dtos.MailDTO;

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
@Table(name = "mails")
public class MailModel {

    public MailModel(MailDTO dto){
        this.nome = dto.getNome();
        this.email = dto.getEmail();
        this.assunto = dto.getAssunto();
        this.mensagem = dto.getMensagem();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String email;

    @Column()
    private String assunto;

    @Column(nullable = false)
    private String mensagem;
}
