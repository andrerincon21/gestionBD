package com.astroplasticos.gestionBD.controller;

import com.astroplasticos.gestionBD.models.ClienteModel;
import com.astroplasticos.gestionBD.services.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    private final ClienteService service;

    // Inyección por constructor (mejor práctica)
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    // GET: listar clientes
    @GetMapping
    public List<ClienteModel> obtenerClientes() {
        return service.obtenerClientes();
    }

    // POST: crear cliente
    @PostMapping
    public ClienteModel guardarCliente(@RequestBody ClienteModel cliente) {
        return service.guardarCliente(cliente);
    }
}