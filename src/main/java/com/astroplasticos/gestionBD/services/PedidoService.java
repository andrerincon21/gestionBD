package com.astroplasticos.gestionBD.services;

// Importamos modelo pedido
import com.astroplasticos.gestionBD.models.PedidoModel;

// Importamos repository
import com.astroplasticos.gestionBD.repositories.IPedidoRepository;

// Librerías Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Librería List
import java.util.List;

// Indicamos que será un servicio
@Service

public class PedidoService {

    // Inyección del repository
    @Autowired
    IPedidoRepository repository;

    // Método para consultar pedidos
    public List<PedidoModel> obtenerPedidos() {

        return repository.findAll();
    }

    // Método para guardar pedidos
    public PedidoModel guardarPedido(PedidoModel pedido) {

        return repository.save(pedido);
    }
}