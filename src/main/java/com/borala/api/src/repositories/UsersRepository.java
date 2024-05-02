package com.borala.api.src.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.borala.api.src.models.UserModel;

@Repository
public interface UsersRepository extends JpaRepository<UserModel, Long> {
    boolean existsByCpf(String cpf);
    Optional<UserModel> findByEmail (String email);
}
