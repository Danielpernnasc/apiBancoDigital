package com.api.apiBanco.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Transient;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;
    private String password;
    private String repeatpassword;

    @Transient
    private ContaInterna contaInterna = new ContaInterna();

    @Transient
    private ContaExterna contaExterna = new ContaExterna();

    public Client() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepeatpassword() {
        return repeatpassword;
    }

    public void setRepeatpassword(String repeatpassword) {
        this.repeatpassword = repeatpassword;
    }

    public ContaInterna getContaInterna() {
        return contaInterna;
    }

    public void setContaInterna(ContaInterna contaInterna) {
        this.contaInterna = contaInterna;
    }

    public ContaExterna getContaExterna() {
        return contaExterna;
    }

    public void setContaExterna(ContaExterna contaExterna) {
        this.contaExterna = contaExterna;
    }
}
