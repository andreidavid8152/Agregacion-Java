package com.example;

public class Motocicleta implements Vehiculo {
    private String tipo;
    private boolean tieneSidecar;

    public Motocicleta(String tipo, boolean tieneSidecar) {
        this.tipo = tipo;
        this.tieneSidecar = tieneSidecar;
    }

    @Override
    public void arrancar() {
        System.out.println("La motocicleta " + tipo + " está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("La motocicleta " + tipo + " está deteniéndose.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Motocicleta tipo " + tipo + ", con sidecar: " + tieneSidecar);
    }
}