package com.astroplasticos.gestionBD.controller;

import com.astroplasticos.gestionBD.models.PedidoModel;
import com.astroplasticos.gestionBD.services.PedidoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    // constructor injection
    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @GetMapping
    public List<PedidoModel> obtenerPedidos() {
        return service.obtenerPedidos();
    }

    @PostMapping
    public PedidoModel guardarPedido(@RequestBody PedidoModel pedido) {
        return service.guardarPedido(pedido);
    }
}
