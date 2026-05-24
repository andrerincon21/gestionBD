package com.astroplasticos.gestionBD.services;

import com.astroplasticos.gestionBD.models.UserModel;
import com.astroplasticos.gestionBD.repositories.IUserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final IUserRepository repository;

    // inyección por constructor
    public UserService(IUserRepository repository) {
        this.repository = repository;
    }

    // consultar usuarios
    public List<UserModel> obtenerUsuarios() {
        return repository.findAll();
    }

    // guardar usuario
    public UserModel guardarUsuario(UserModel user) {
        return repository.save(user);
    }
}
