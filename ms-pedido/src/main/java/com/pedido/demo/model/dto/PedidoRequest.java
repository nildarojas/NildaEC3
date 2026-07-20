package com.pedido.demo.model.dto;

public class PedidoRequest {
    private String solicitante;
    private String codigoProducto;
    private String pasilloOrigen;
    private int cantidad;

    // Getters y Setters
    public String getSolicitante() { return solicitante; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }
    public String getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }
    public String getPasilloOrigen() { return pasilloOrigen; }
    public void setPasilloOrigen(String pasilloOrigen) { this.pasilloOrigen = pasilloOrigen; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}