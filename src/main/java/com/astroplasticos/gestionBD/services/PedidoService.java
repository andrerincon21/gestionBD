package com.astroplasticos.gestionBD.services;

import com.astroplasticos.gestionBD.models.PedidoModel;
import com.astroplasticos.gestionBD.repositories.IPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    private final IPedidoRepository repository;

    // inyección por constructor
    public PedidoService(IPedidoRepository repository) {
        this.repository = repository;
    }

    // consultar pedidos
    public List<PedidoModel> obtenerPedidos() {
        return repository.findAll();
    }

    // guardar pedido
    public PedidoModel guardarPedido(PedidoModel pedido) {
        return repository.save(pedido);
    }
}