package com.tm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tm.model.PermanentContract;
import com.tm.repository.PermanentContractRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PermanentContractService {
    private final PermanentContractRepository permanentContractRepository;

    public PermanentContract addPermanentContract(PermanentContract permanentContract) {
        return permanentContractRepository.save(permanentContract);
    }

    public List<PermanentContract> getAllPermanentContracts() {
        return permanentContractRepository.findAll();
    }

    public Optional<PermanentContract> getPermanentContractById(Long id) {
        return permanentContractRepository.findById(id);
    }

    public void deletePermanentContract(Long id) {
        permanentContractRepository.deleteById(id);
    }
}