package pe.edu.upeu.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio1 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 1: LISTA DE COMPRAS ---");
        ArrayList<String> productos = new ArrayList<>();

        productos.add("Leche");
        productos.add("Pan");
        productos.add("Huevos");

        // Evitar duplicados
        if (!productos.contains("Leche")) {
            productos.add("Leche");
        } else {
            System.out.println("Aviso: 'Leche' ya está en la lista.");
        }

        Collections.sort(productos);
        System.out.println("Lista final: " + productos);
    }
}