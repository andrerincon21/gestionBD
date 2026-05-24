package com.astroplasticos.gestionBD.repositories;

// Importamos el modelo usuario
import com.astroplasticos.gestionBD.models.UserModel;

// Importamos JpaRepository
import org.springframework.data.jpa.repository.JpaRepository;

// Interface para realizar operaciones CRUD
public interface IUserRepository extends JpaRepository<UserModel, Long> {

}