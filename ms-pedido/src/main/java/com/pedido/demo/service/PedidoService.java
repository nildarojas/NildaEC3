package com.pedido.demo.service;

import com.pedido.demo.model.dto.PedidoRequest;
import com.pedido.demo.model.entity.PedidoEntity;

public interface PedidoService {
    void registrarPedido(PedidoRequest pedidoRequest);
    Iterable<PedidoEntity> obtenerHistorial();
}