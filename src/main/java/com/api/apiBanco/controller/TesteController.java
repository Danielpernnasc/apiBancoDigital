package com.api.apiBanco.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@RestController
public class TesteController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/teste-db")
    public String testConnection() {
        try (Connection conn = dataSource.getConnection()) {
            return "✅ Conexão com o banco estabelecida!";
        } catch (SQLException e) {
            return "❌ Erro ao conectar: " + e.getMessage();
        }
    }
}
