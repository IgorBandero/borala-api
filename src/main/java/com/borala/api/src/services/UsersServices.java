package com.borala.api.src.services;

import org.springframework.stereotype.Service;

import com.borala.api.src.dtos.UserDTO;
import com.borala.api.src.exceptions.UserConflictException;
import com.borala.api.src.models.UserModel;
import com.borala.api.src.repositories.UsersRepository;

@Service
public class UsersServices {
    final UsersRepository usersRepository;
    UsersServices(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public UserModel save(UserDTO dto){
        if(usersRepository.existsByCpf(dto.getCpf())){
            throw new UserConflictException("CPF já cadastrado!");
        }
        UserModel user = new UserModel(dto);
        return usersRepository.save(user);
    }
}
