package org.example.productos;

import java.util.ArrayList;

abstract public class Producto {
    protected String marca;
    protected float precio;
    static public ArrayList<Producto> productos = new ArrayList<>();

    public Producto(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String toString() {
        return "Marca: " + marca + ", Precio: " + precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
