package com.borala.api.src.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.borala.api.src.models.MailModel;
import com.borala.api.src.models.UserModel;

@Repository
public interface MailRepository extends JpaRepository<MailModel, Long> {
    Optional<MailModel> findByEmail (String email);
}
