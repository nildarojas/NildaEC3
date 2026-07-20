package com.pedido.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "InventarioClient", url = "http://localhost:8083/v1/productos")
public interface InventarioClient {

    @GetMapping("/verificar")
    boolean verificar(@RequestParam("codigo") String codigo, @RequestParam("pasillo") String pasillo);
}