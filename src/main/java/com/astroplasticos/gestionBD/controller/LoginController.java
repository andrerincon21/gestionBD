package com.astroplasticos.gestionBD.controller;

// Importamos modelo usuario
import com.astroplasticos.gestionBD.models.UserModel;

// Importamos service
import com.astroplasticos.gestionBD.services.UserService;

// Librerías Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

// Librería List
import java.util.List;

// Indicamos que será un controlador REST
@RestController

// Ruta principal del controlador
@RequestMapping("/usuarios")

public class LoginController {

    // Inyección del service
    @Autowired
    UserService service;

    // Método GET para consultar usuarios
    @GetMapping
    public List<UserModel> obtenerUsuarios() {

        return service.obtenerUsuarios();
    }

    // Método POST para guardar usuarios
    @PostMapping
    public UserModel guardarUsuario(@RequestBody UserModel user) {

        return service.guardarUsuario(user);
    }
}