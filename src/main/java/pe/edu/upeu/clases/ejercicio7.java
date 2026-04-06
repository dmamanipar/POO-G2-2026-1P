package pe.edu.upeu.clases;

import java.util.ArrayList;

class Habitacion {
    int numero;
    String tipo;
    boolean ocupada;

    Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupada = false;
    }
}

public class ejercicio7 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 7 (REF 9): RESERVAS DE HOTEL ---");

        ArrayList<Habitacion> hotel = new ArrayList<>();
        hotel.add(new Habitacion(101, "Simple"));
        hotel.add(new Habitacion(102, "Doble"));
        hotel.add(new Habitacion(103, "Suite"));

        // Simular una reserva
        System.out.println("Buscando habitaciones disponibles...");
        for (Habitacion h : hotel) {
            if (!h.ocupada) {
                System.out.println("Habitación " + h.numero + " (" + h.tipo + ") DISPONIBLE");
            }
        }

        // Reservar la primera
        hotel.get(0).ocupada = true;
        System.out.println("\nReserva realizada: Habitación 101 ahora está OCUPADA.");
    }
}