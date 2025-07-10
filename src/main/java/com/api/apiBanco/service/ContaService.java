package com.api.apiBanco.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.api.apiBanco.model.ContaExterna;
import com.api.apiBanco.model.ContaInterna;

@Service
public class ContaService {

    private ContaInterna contaInterna = new ContaInterna();
    private ContaExterna contaExterna = new ContaExterna();

    public Map<String, Object> consultarSaldos() {
        Map<String, Object> saldos = new HashMap<>();
        saldos.put("contaInterna", contaInterna);
        saldos.put("contaExterna", contaExterna);
        return saldos;
    }

    public String transferirParaInterna(Double valor) {
        if (contaExterna.getSaldo() >= valor) {
            contaExterna.setSaldo(contaExterna.getSaldo() - valor);
            contaInterna.setSaldo(contaInterna.getSaldo() + valor);
            return "Transferência de " + valor + " realizada com sucesso para a conta interna.";
        } else {
            return "Saldo insuficiente na conta externa para realizar a transferência.";
        }
    }

    public String transferirParaExterna(Double valor) {
        if (contaInterna.getSaldo() >= valor) {
            contaInterna.setSaldo(contaInterna.getSaldo() - valor);
            contaExterna.setSaldo(contaExterna.getSaldo() + valor);
            return "Transferência de R$" + valor + " realizada com sucesso para a conta externa.";
        } else {
            return "Saldo insuficiente na conta interna para realizar a transferência.";
        }
    }

}
