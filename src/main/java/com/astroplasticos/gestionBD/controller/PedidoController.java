package com.astroplasticos.gestionBD.controller;

// Importamos modelo pedido
import com.astroplasticos.gestionBD.models.PedidoModel;

// Importamos service
import com.astroplasticos.gestionBD.services.PedidoService;

// Librerías Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Librería List
import java.util.List;

// Indicamos que será un controlador REST
@RestController

// Ruta principal
@RequestMapping("/pedidos")

public class PedidoController {

    // Inyección del service
    @Autowired
    PedidoService service;

    // Método GET para consultar pedidos
    @GetMapping
    public List<PedidoModel> obtenerPedidos() {

        return service.obtenerPedidos();
    }

    // Método POST para guardar pedidos
    @PostMapping
    public PedidoModel guardarPedido(@RequestBody PedidoModel pedido) {

        return service.guardarPedido(pedido);
    }
}
