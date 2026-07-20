package com.pedido.demo.repository;

import com.pedido.demo.model.entity.PedidoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<PedidoEntity, Integer> {
}