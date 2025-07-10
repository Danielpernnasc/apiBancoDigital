package com.api.apiBanco.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ContaInterna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id;

    private String banco = "Banco Interno";
    private Long agencia = 123L;
    private Long conta = 456L;
    private Double saldo = 500.0;

    public ContaInterna() {
        this.banco = "Banco Interno";
        this.agencia = 123L;
        this.conta = 456L;
        this.saldo = 500.0;
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
    // return "ContaInterna{" +
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
    // if (!(o instanceof ContaInterna))
    // return false;

    // ContaInterna that = (ContaInterna) o;

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

    // public ContaInterna(String banco, Long agencia, Long conta, Double saldo) {
    // this.banco = banco;
    // this.agencia = agencia;
    // this.conta = conta;
    // this.saldo = saldo;
    // }
}
