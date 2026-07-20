package com.inventario.demo.service.impl;

import com.inventario.demo.model.dto.ProductoRequest;
import com.inventario.demo.model.dto.ProductoResponse;
import com.inventario.demo.model.mapper.ProductoMapper;
import com.inventario.demo.repository.ProductoRepository;
import com.inventario.demo.service.ProductoService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository repository;

    public ProductoServiceImpl(ProductoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void registrarProducto(ProductoRequest request) {
        var entity = ProductoMapper.MAPPER.toProductoEntity(request);
        repository.save(entity);
    }

    @Override
    public Iterable<ProductoResponse> obtenerProductos() {
        var productos = repository.findAll();
        var lista = new ArrayList<ProductoResponse>();
        productos.forEach(x -> lista.add(ProductoMapper.MAPPER.toProductoResponse(x)));
        return lista;
    }

    @Override
    public boolean verificarStock(String codigo, String pasillo) {
        return repository.findByCodigoAndPasillo(codigo, pasillo).isPresent();
    }
}