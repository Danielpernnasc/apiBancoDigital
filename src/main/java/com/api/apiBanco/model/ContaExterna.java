package com.api.apiBanco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContaExterna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;
    private String banco = "Banco Externo";
    private Long agencia = 789L;
    private Long conta = 987L;
    private Double saldo = 1000.0;

    public ContaExterna() {
        this.banco = "Banco Externo";
        this.agencia = 789L;
        this.conta = 987L;
        this.saldo = 1000.0;
    }

    // public Long getId() {
    // return id;
    // }

    // public void setId(Long id) {
    // this.id = id;
    // }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Long getAgencia() {
        return agencia;
    }

    public void setAgencia(Long agencia) {
        this.agencia = agencia;
    }

    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    // @Override
    // public String toString() {
    // return "ContaExterna{" +
    // "banco='" + banco + '\'' +
    // ", agencia=" + agencia +
    // ", conta=" + conta +
    // ", saldo=" + saldo +
    // '}';
    // }

    // @Override
    // public boolean equals(Object o) {
    // if (this == o)
    // return true;
    // if (!(o instanceof ContaExterna))
    // return false;

    // ContaExterna that = (ContaExterna) o;

    // if (!banco.equals(that.banco))
    // return false;
    // if (!agencia.equals(that.agencia))
    // return false;
    // if (!conta.equals(that.conta))
    // return false;
    // return saldo.equals(that.saldo);
    // }

    // @Override
    // public int hashCode() {
    // int result = banco.hashCode();
    // result = 31 * result + agencia.hashCode();
    // result = 31 * result + conta.hashCode();
    // result = 31 * result + saldo.hashCode();
    // return result;
    // }

    // public ContaExterna(String banco, Long agencia, Long conta, Double saldo) {
    // this.banco = banco;
    // this.agencia = agencia;
    // this.conta = conta;
    // this.saldo = saldo;
    // }
}
