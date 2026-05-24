package com.astroplasticos.gestionBD.services;

import com.astroplasticos.gestionBD.models.ProductModel;
import com.astroplasticos.gestionBD.repositories.IProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    // dependencia (ahora es final)
    private final IProductRepository repository;

    // inyección por constructor (RECOMENDADO)
    public ProductService(IProductRepository repository) {
        this.repository = repository;
    }

    // consultar productos
    public List<ProductModel> obtenerProductos() {
        return repository.findAll();
    }

    // guardar productos
    public ProductModel guardarProducto(ProductModel producto) {
        return repository.save(producto);
    }
}