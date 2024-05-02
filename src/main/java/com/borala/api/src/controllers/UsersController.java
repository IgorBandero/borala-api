package com.borala.api.src.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.borala.api.src.dtos.UserDTO;
import com.borala.api.src.models.UserModel;
import com.borala.api.src.services.UsersServices;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/user")
public class UsersController {

    final UsersServices usersServices;
    UsersController(UsersServices usersServices){
        this.usersServices = usersServices;
    }

    @PostMapping
    public ResponseEntity<UserModel> createCustomer(@RequestBody @Valid UserDTO body) {        
        UserModel user = usersServices.save(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }    

    @GetMapping("/{id}")
    public ResponseEntity<UserModel> getUserById(@PathVariable Long id) {
        UserModel user = usersServices.findById(id);
        return ResponseEntity.status(HttpStatus.OK).body(user);
    }
}
