package com.pedido.demo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_pedido")
public class PedidoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String solicitante; // Nilda, etc.
    private String codigoProducto;
    private String pasilloOrigen;
    private int cantidad;

    public PedidoEntity() {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getSolicitante() { return solicitante; }
    public void setSolicitante(String solicitante) { this.solicitante = solicitante; }
    public String getCodigoProducto() { return codigoProducto; }
    public void setCodigoProducto(String codigoProducto) { this.codigoProducto = codigoProducto; }
    public String getPasilloOrigen() { return pasilloOrigen; }
    public void setPasilloOrigen(String pasilloOrigen) { this.pasilloOrigen = pasilloOrigen; }
    public int getCantidad() { return cantidad; }
    public void setCantidad(int cantidad) { this.cantidad = cantidad; }
}