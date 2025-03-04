package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.model.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {}
