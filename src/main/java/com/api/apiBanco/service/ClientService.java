package com.api.apiBanco.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.apiBanco.model.Client;
import com.api.apiBanco.model.ContaExterna;
import com.api.apiBanco.model.ContaInterna;
import com.api.apiBanco.repository.ClientRepository;

@Service

public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> listarTodos() {
        return clientRepository.findAll();
    }

    public Optional<Client> getByEmail(String email) {
        return clientRepository.findByEmail(email);
    }

    public Client buscarForIdCliente(Long id) {
        return clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }

    public Client salve(Client client) {
        if (client.getContaInterna() == null) {
            client.setContaInterna(new ContaInterna());
        }
        if (client.getContaExterna() == null) {
            client.setContaExterna(new ContaExterna());
        }
        return clientRepository.save(client);
    }

    public Optional<Client> autenticar(String email, String password) {
        return clientRepository.findByEmail(email)
                .filter(client -> client.getPassword().equals(password));
    }

    public Client update(Long id, Client client) {
        return clientRepository.findById(id).map(existingClient -> {
            existingClient.setNome(client.getNome());
            existingClient.setEmail(client.getEmail());
            existingClient.setPassword(client.getPassword());
            existingClient.setRepeatpassword(client.getRepeatpassword());
            if (client.getContaInterna() != null) {
                existingClient.setContaInterna(client.getContaInterna());
            }
            if (client.getContaExterna() != null) {
                existingClient.setContaExterna(client.getContaExterna());
            }
            return clientRepository.save(existingClient);
        }).orElseThrow(() -> new RuntimeException("Cliente não encontrado com o ID: " + id));
    }

    public void deletar(Long id) {
        if (!clientRepository.existsById(id)) {
            throw new RuntimeException("Cliente não encontrado");
        }
        clientRepository.deleteById(id);
    }
}
