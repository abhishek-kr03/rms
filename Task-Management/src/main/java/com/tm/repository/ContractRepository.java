package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.model.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {}
