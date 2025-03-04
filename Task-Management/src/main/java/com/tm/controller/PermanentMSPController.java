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

import com.tm.model.PermanentMSP;
import com.tm.service.PermanentMSPService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/permanent-msp")
@RequiredArgsConstructor
public class PermanentMSPController {
    private final PermanentMSPService permanentMSPService;

    @PostMapping
    public ResponseEntity<PermanentMSP> createPermanentMSP(@RequestBody PermanentMSP permanentMSP) {
        return ResponseEntity.ok(permanentMSPService.addPermanentMSP(permanentMSP));
    }

    @GetMapping
    public ResponseEntity<List<PermanentMSP>> getAllPermanentMSPs() {
        return ResponseEntity.ok(permanentMSPService.getAllPermanentMSPs());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PermanentMSP> getPermanentMSPById(@PathVariable Long id) {
        return permanentMSPService.getPermanentMSPById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePermanentMSP(@PathVariable Long id) {
        permanentMSPService.deletePermanentMSP(id);
        return ResponseEntity.noContent().build();
    }
}