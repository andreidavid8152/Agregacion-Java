package com.example;

public class Coche implements Vehiculo {
    private String modelo;
    private int ano;

    public Coche(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    @Override
    public void arrancar() {
        System.out.println("El coche " + modelo + " está arrancando.");
    }

    @Override
    public void detener() {
        System.out.println("El coche " + modelo + " está deteniéndose.");
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Coche " + modelo + ", año " + ano);
    }
}
