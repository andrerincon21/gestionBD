package com.astroplasticos.gestionBD.models;

// Importamos librerías de persistencia
import jakarta.persistence.*;

// Indicamos que será una entidad
@Entity

// Nombre de la tabla en MySQL
@Table(name = "pedido")

public class PedidoModel {

    // Llave primaria
    @Id

    // Id autoincrementable
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Nombre del cliente
    private String cliente;

    // Nombre del producto
    private String producto;

    // Cantidad solicitada
    private Integer cantidad;

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}