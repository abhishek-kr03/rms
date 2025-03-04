package com.tm.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tm.model.PermanentContract;
import com.tm.service.PermanentContractService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/permanent-contracts")
@RequiredArgsConstructor
public class PermanentContractController {
    private final PermanentContractService permanentContractService;

    @PostMapping
    public ResponseEntity<PermanentContract> createPermanentContract(@RequestBody PermanentContract permanentContract) {
        return ResponseEntity.ok(permanentContractService.addPermanentContract(permanentContract));
    }

    @GetMapping
    public ResponseEntity<List<PermanentContract>> getAllPermanentContracts() {
        return ResponseEntity.ok(permanentContractService.getAllPermanentContracts());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PermanentContract> getPermanentContractById(@PathVariable Long id) {
        return permanentContractService.getPermanentContractById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePermanentContract(@PathVariable Long id) {
        permanentContractService.deletePermanentContract(id);
        return ResponseEntity.noContent().build();
    }
}