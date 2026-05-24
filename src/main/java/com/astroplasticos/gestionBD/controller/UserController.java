package com.astroplasticos.gestionBD.controller;

import com.astroplasticos.gestionBD.models.UserModel;
import com.astroplasticos.gestionBD.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UserService service;

    // inyección por constructor
    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserModel> obtenerUsuarios() {
        return service.obtenerUsuarios();
    }

    @PostMapping
    public UserModel guardarUsuario(@RequestBody UserModel user) {
        return service.guardarUsuario(user);
    }
}