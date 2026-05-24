package com.astroplasticos.gestionBD.repositories;

// Importamos modelo pedido
import com.astroplasticos.gestionBD.models.PedidoModel;

// Importamos JpaRepository
import org.springframework.data.jpa.repository.JpaRepository;

// Interface para CRUD de pedidos
public interface IPedidoRepository extends JpaRepository<PedidoModel, Long> {

}
