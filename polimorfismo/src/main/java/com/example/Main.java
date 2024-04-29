package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Coche("Toyota Corolla", 2021));
        vehiculos.add(new Motocicleta("Harley Davidson", true));

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.arrancar();
            vehiculo.mostrarInfo();
            vehiculo.detener();
            System.out.println();
        }
    }
}