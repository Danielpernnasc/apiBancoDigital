package com.api.apiBanco.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.apiBanco.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByEmail(String email);
}
