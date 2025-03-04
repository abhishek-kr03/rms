package com.tm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tm.model.Contract;
import com.tm.repository.ContractRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;

    public Contract addContract(Contract contract) {
        return contractRepository.save(contract);
    }

    public List<Contract> getAllContracts() {
        return contractRepository.findAll();
    }
}
