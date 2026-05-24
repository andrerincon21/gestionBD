package com.astroplasticos.gestionBD.services;

// Importamos modelo usuario
import com.astroplasticos.gestionBD.models.UserModel;

// Importamos repository
import com.astroplasticos.gestionBD.repositories.IUserRepository;

// Librerías de Spring
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Librería para listas
import java.util.List;

// Indicamos que esta clase será un servicio
@Service

public class UserService {

    // Inyección del repository
    @Autowired
    IUserRepository repository;

    // Método para consultar usuarios
    public List<UserModel> obtenerUsuarios() {

        return repository.findAll();
    }

    // Método para guardar usuario
    public UserModel guardarUsuario(UserModel user) {

        return repository.save(user);
    }
}
