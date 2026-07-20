package com.inventario.demo.service;

import com.inventario.demo.model.dto.ProductoRequest;
import com.inventario.demo.model.dto.ProductoResponse;

public interface ProductoService {
    void registrarProducto(ProductoRequest request);
    Iterable<ProductoResponse> obtenerProductos();
    boolean verificarStock(String codigo, String pasillo);
}