package com.astroplasticos.gestionBD.services;

// Importamos modelo producto
import com.astroplasticos.gestionBD.models.ProductModel;

// Importamos repository
import com.astroplasticos.gestionBD.repositories.IProductRepository;

// Librerías Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Librería List
import java.util.List;

// Indicamos que será un servicio
@Service

public class ProductService {

    // Inyección del repository
    @Autowired
    IProductRepository repository;

    // Método para consultar productos
    public List<ProductModel> obtenerProductos() {

        return repository.findAll();
    }

    // Método para guardar productos
    public ProductModel guardarProducto(ProductModel producto) {

        return repository.save(producto);
    }
}