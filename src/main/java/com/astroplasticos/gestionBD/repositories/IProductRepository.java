package com.astroplasticos.gestionBD.repositories;

// Importamos el modelo producto
import com.astroplasticos.gestionBD.models.ProductModel;

// Librería JpaRepository
import org.springframework.data.jpa.repository.JpaRepository;

// Interface para CRUD de productos
public interface IProductRepository extends JpaRepository<ProductModel, Long> {

}