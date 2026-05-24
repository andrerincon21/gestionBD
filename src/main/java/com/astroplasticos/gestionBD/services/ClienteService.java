package com.astroplasticos.gestionBD.services;

import com.astroplasticos.gestionBD.models.ClienteModel;
import com.astroplasticos.gestionBD.repositories.IClienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final IClienteRepository repository;

    // Inyección por constructor (BUENA PRÁCTICA)
    public ClienteService(IClienteRepository repository) {
        this.repository = repository;
    }

    // Consultar todos los clientes
    public List<ClienteModel> obtenerClientes() {
        return repository.findAll();
    }

    // Guardar cliente
    public ClienteModel guardarCliente(ClienteModel cliente) {
        return repository.save(cliente);
    }

    // Buscar por ID
    public ClienteModel buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Eliminar cliente
    public void eliminarCliente(Long id) {
        repository.deleteById(id);
    }
}
