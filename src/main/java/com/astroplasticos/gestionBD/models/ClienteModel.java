package com.astroplasticos.gestionBD.models;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo_bolsa;
    private Integer cantidad;
    private String telefono;

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

    public String getTipo_bolsa() {
        return tipo_bolsa;
    }

    public void setTipo_bolsa(String tipo_bolsa) {
        this.tipo_bolsa = tipo_bolsa;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
