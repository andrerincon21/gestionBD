package com.astroplasticos.gestionBD.models;

// Librerías necesarias para trabajar con JPA
import jakarta.persistence.*;

// Indicamos que esta clase será una entidad
@Entity

// Nombre de la tabla en MySQL
@Table(name = "producto")

public class ProductModel {

    // Llave primaria
    @Id

    // Generación automática del id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del producto
    private String nombre;

    // Precio del producto
    private Double precio;

    // Cantidad disponible
    private Integer cantidad;

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}