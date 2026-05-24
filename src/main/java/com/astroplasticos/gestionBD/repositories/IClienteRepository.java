package com.astroplasticos.gestionBD.repositories;

import com.astroplasticos.gestionBD.models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository<ClienteModel, Long> {
}
