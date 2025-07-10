package com.api.apiBanco.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.api.apiBanco.service.ContaService;

public class ContaController {
    private ContaService contaService;

    @GetMapping("/saldos")
    public ResponseEntity<?> getSaldo() {
        return ResponseEntity.ok(contaService.consultarSaldos());
    }

    @PostMapping("/transferir-para-interna")
    public ResponseEntity<?> transferirParaInterna(@RequestParam Double valor) {
        try {
            return ResponseEntity.ok(contaService.transferirParaInterna(valor));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping("/transferir-para-externa")
    public ResponseEntity<?> transferirParaExterna(@RequestParam Double valor) {
        try {
            return ResponseEntity.ok(contaService.transferirParaExterna(valor));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
