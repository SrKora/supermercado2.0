package org.example.productos;

import org.example.interfazes.IDescuento;

public class Detergente extends Producto implements IDescuento {
    private float descuento;

    public Detergente(String marca, float precio, float descuento) {
        super(marca, precio);
        this.descuento = descuento;
    }

    @Override
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public float getDescuento() {
        return this.descuento;
    }

    @Override
    public float getPrecioDescuento() {
        return this.precio*(descuento/100);
    }
}
