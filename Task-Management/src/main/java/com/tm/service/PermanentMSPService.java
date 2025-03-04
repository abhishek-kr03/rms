package com.tm.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tm.model.PermanentMSP;
import com.tm.repository.PermanentMSPRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PermanentMSPService {
    private final PermanentMSPRepository permanentMSPRepository;

    public PermanentMSP addPermanentMSP(PermanentMSP permanentMSP) {
        return permanentMSPRepository.save(permanentMSP);
    }

    public List<PermanentMSP> getAllPermanentMSPs() {
        return permanentMSPRepository.findAll();
    }

    public Optional<PermanentMSP> getPermanentMSPById(Long id) {
        return permanentMSPRepository.findById(id);
    }

    public void deletePermanentMSP(Long id) {
        permanentMSPRepository.deleteById(id);
    }
}