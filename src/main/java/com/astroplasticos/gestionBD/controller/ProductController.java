package com.astroplasticos.gestionBD.controller;

import com.astroplasticos.gestionBD.models.ProductModel;
import com.astroplasticos.gestionBD.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductController {

    private final ProductService service;

    // constructor injection
    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<ProductModel> obtenerProductos() {
        return service.obtenerProductos();
    }

    @PostMapping
    public ProductModel guardarProducto(@RequestBody ProductModel producto) {
        return service.guardarProducto(producto);
    }
}