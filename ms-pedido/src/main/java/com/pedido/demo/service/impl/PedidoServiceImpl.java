package com.pedido.demo.service.impl;

import com.pedido.demo.client.InventarioClient;
import com.pedido.demo.model.dto.PedidoRequest;
import com.pedido.demo.model.entity.PedidoEntity;
import com.pedido.demo.repository.PedidoRepository;
import com.pedido.demo.service.PedidoService;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl implements PedidoService {

    private final PedidoRepository repository;
    private final InventarioClient inventarioClient;

    public PedidoServiceImpl(PedidoRepository repository, InventarioClient inventarioClient) {
        this.repository = repository;
        this.inventarioClient = inventarioClient;
    }

    @Override
    public void registrarPedido(PedidoRequest dto) {
        boolean existeStock = inventarioClient.verificar(dto.getCodigoProducto(), dto.getPasilloOrigen());

        if (!existeStock) {
            throw new RuntimeException("Error: El producto solicitado no existe o no se encuentra en el pasillo indicado.");
        }

        PedidoEntity entity = new PedidoEntity();
        entity.setSolicitante(dto.getSolicitante());
        entity.setCodigoProducto(dto.getCodigoProducto());
        entity.setPasilloOrigen(dto.getPasilloOrigen());
        entity.setCantidad(dto.getCantidad());

        repository.save(entity);
    }

    @Override
    public Iterable<PedidoEntity> obtenerHistorial() {
        return repository.findAll();
    }
}