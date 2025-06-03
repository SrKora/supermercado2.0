package org.example.productos;

import org.example.interfazes.IAlimento;
import org.example.interfazes.IDescuento;
import org.example.interfazes.ILiquido;

import java.time.LocalDate;

public class Vino extends Producto implements ILiquido, IAlimento, IDescuento {
    private String tipoDeVino;
    private float gradosAlcohol;
    private LocalDate caducidad;
    private int calorias;
    private float descuento;
    private float volumen;
    private String tipoDeEnvase;

    public Vino(String marca, float precio, String tipoDeVino, float gradosAlcohol) {
        super(marca, precio);
        this.tipoDeVino = tipoDeVino;
        this.gradosAlcohol = gradosAlcohol;
    }

    public String getTipoDeVino() {
        return tipoDeVino;
    }

    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }

    public float getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(float gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
    }

    @Override
    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    @Override
    public LocalDate getCaducidad() {
        return caducidad;
    }

    @Override
    public int getCalorias() {
        return (int)(gradosAlcohol*10);
    }

    @Override
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    @Override
    public float getDescuento() {
        return descuento;
    }

    @Override
    public float getPrecioDescuento() {
        return precio*(descuento/100);
    }

    @Override
    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    @Override
    public float getVolumen() {
        return volumen;
    }

    @Override
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoDeEnvase = tipoEnvase;
    }

    @Override
    public String getTipoEnvase() {
        return tipoDeEnvase;
    }
}