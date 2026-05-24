package com.astroplasticos.gestionBD.controller;

// Importamos modelo producto
import com.astroplasticos.gestionBD.models.ProductModel;

// Importamos service
import com.astroplasticos.gestionBD.services.ProductService;

// Librerías Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Librería List
import java.util.List;

// Indicamos que será un controlador REST
@RestController

// Ruta principal
@RequestMapping("/productos")

public class ProductController {

    // Inyección del service
    @Autowired
    ProductService service;

    // Método GET para consultar productos
    @GetMapping
    public List<ProductModel> obtenerProductos() {

        return service.obtenerProductos();
    }

    // Método POST para guardar productos
    @PostMapping
    public ProductModel guardarProducto(@RequestBody ProductModel producto) {

        return service.guardarProducto(producto);
    }
}