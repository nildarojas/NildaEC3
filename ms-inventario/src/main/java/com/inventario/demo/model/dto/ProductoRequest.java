package com.inventario.demo.model.dto;

public class ProductoRequest {
    private String codigo;
    private String nombre;
    private String pasillo;

    public ProductoRequest() {
    }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPasillo() { return pasillo; }
    public void setPasillo(String pasillo) { this.pasillo = pasillo; }
}