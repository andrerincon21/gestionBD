package com.astroplasticos.gestionBD.models;

// Importamos las librerías necesarias de JPA
import jakarta.persistence.*;

// Indicamos que esta clase será una entidad de la base de datos
@Entity

// Nombre de la tabla en MySQL
@Table(name = "cliente")

public class UserModel {

    // Llave primaria de la tabla
    @Id

    // El id se genera automáticamente
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Campo usuario
    private String usuario;

    // Campo contraseña
    private String password;

    // =========================
    // GETTERS Y SETTERS
    // =========================

    public Long getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}