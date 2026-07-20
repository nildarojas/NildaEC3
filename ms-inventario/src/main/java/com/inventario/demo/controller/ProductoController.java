package com.inventario.demo.controller;

import com.inventario.demo.model.dto.ProductoRequest;
import com.inventario.demo.model.dto.ProductoResponse;
import com.inventario.demo.service.ProductoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/productos")
@Tag(name = "API de Inventario", description = "Control de stock para el almacén de Nilda")
public class ProductoController {

    private final ProductoService service;

    public ProductoController(ProductoService service) {
        this.service = service;
    }

    @PostMapping("/register")
    @Operation(description = "Registra un producto en el almacén")
    public void registrar(@RequestBody ProductoRequest request) {
        service.registrarProducto(request);
    }

    @GetMapping("/verificar")
    public boolean verificar(@RequestParam("codigo") String codigo, @RequestParam("pasillo") String pasillo) {
        return service.verificarStock(codigo, pasillo);
    }
}