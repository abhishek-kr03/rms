package com.tm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tm.model.PermanentContract;

public interface PermanentContractRepository extends JpaRepository<PermanentContract, Long> {}
