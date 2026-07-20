package com.inventario.demo.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_producto")
public class ProductoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codigo;
    private String nombre;
    private String pasillo;

    public ProductoEntity() {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getNombre() { return nombre; }
    // Arreglado aquí:
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getPasillo() { return pasillo; }
    public void setPasillo(String pasillo) { this.pasillo = pasillo; }
}