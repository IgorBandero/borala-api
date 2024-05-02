package com.borala.api.src.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.borala.api.src.dtos.UserDTO;
import com.borala.api.src.exceptions.UserConflictException;
import com.borala.api.src.exceptions.UserNotFoundException;
import com.borala.api.src.models.UserModel;
import com.borala.api.src.repositories.UsersRepository;

@Service
public class UsersServices {

    final PasswordEncoder encoder;
    final UsersRepository usersRepository;

    UsersServices(UsersRepository usersRepository, PasswordEncoder encoder){
        this.usersRepository = usersRepository;
        this.encoder = encoder;
    }

    public UserModel save(UserDTO dto){
        if(usersRepository.existsByCpf(dto.getCpf())){
            throw new UserConflictException("CPF já cadastrado!");
        }
        if(usersRepository.findByEmail(dto.getEmail()).isPresent()){
            throw new UserConflictException("E-mail já cadastrado!");
        }
        dto.setEmail(dto.getEmail().toLowerCase().trim());
        dto.setSenha(encoder.encode(dto.getSenha()));
        UserModel user = new UserModel(dto);
        return usersRepository.save(user);
    }

    public UserModel findById(Long id){
        return usersRepository.findById(id).orElseThrow(
            () -> new UserNotFoundException("Usuário não encontrado!"));
    }
}
