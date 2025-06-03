package org.example.productos;

import org.example.interfazes.IAlimento;

import java.time.LocalDate;

public class Cereales extends Producto implements IAlimento {
    private String tipoDeCereal;
    private LocalDate caducidad;
    private int calorias;

    public Cereales(String marca, float precio, String tipoDeCereal) {
        super(marca, precio);
        this.tipoDeCereal = tipoDeCereal;
    }

    public String getTipoDeCereal() {
        return tipoDeCereal;
    }

    public void setTipoDeCereal(String tipoDeCereal) {
        this.tipoDeCereal = tipoDeCereal;
    }

    @Override
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public LocalDate getCaducidad() {
        return this.caducidad;
    }

    @Override
    public int getCalorias() {
        switch (tipoDeCereal) {
            case "espelta":
                return 5;
            case "maíz":
                return 8;
            case "trigo":
                return 15;
            default:
                return 15;
        }
    }
}
