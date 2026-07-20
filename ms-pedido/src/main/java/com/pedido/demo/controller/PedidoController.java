package com.pedido.demo.controller;

import com.pedido.demo.model.dto.PedidoRequest;
import com.pedido.demo.model.entity.PedidoEntity;
import com.pedido.demo.service.PedidoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/reservas")
@Tag(name = "API de Pedidos y Despacho", description = "Gestión de órdenes para Nilda")
public class PedidoController {

    private final PedidoService service;

    public PedidoController(PedidoService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @Operation(description = "Registra un pedido validando stock en el almacén externo")
    public void register(@RequestBody PedidoRequest request) {
        service.registrarPedido(request);
    }

    @GetMapping
    public Iterable<PedidoEntity> reservas() {
        return service.obtenerHistorial();
    }
}