package pe.edu.upeu.internas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Clase para representar cada producto del almacén
class Producto {
    String nombre;
    int stock;

    Producto(String nombre, int stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return String.format("%-15s | Stock: %d", nombre, stock);
    }
}

public class inventariosimple implements Iterable<Producto> {
    private ArrayList<Producto> listaProductos = new ArrayList<>();

    public void agregarProducto(String nombre, int stock) {
        listaProductos.add(new Producto(nombre, stock));
    }

    // CLASE INTERNA: El Iterador que filtra productos agotados
    private class IteradorDisponible implements Iterator<Producto> {
        private int indice = 0;

        @Override
        public boolean hasNext() {
            // Avanza el índice mientras el producto actual no tenga stock
            while (indice < listaProductos.size() && listaProductos.get(indice).stock <= 0) {
                indice++;
            }
            return indice < listaProductos.size();
        }

        @Override
        public Producto next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return listaProductos.get(indice++);
        }
    }

    @Override
    public Iterator<Producto> iterator() {
        return new IteradorDisponible();
    }

    public static void main(String[] args) {
        inventariosimple almacen = new inventariosimple();

        // Agregamos varios productos para que el reporte sea largo
        almacen.agregarProducto("Laptop Core i7", 12);
        almacen.agregarProducto("Mouse Óptico", 0);    // Agotado
        almacen.agregarProducto("Teclado RGB", 8);
        almacen.agregarProducto("Monitor 27\"", 0);     // Agotado
        almacen.agregarProducto("Impresora Láser", 4);
        almacen.agregarProducto("Webcam HD", 15);
        almacen.agregarProducto("USB 64GB", 0);        // Agotado

        System.out.println("============================");
        System.out.println("   SISTEMA DE INVENTARIO INTELIGENTE");
        System.out.println("   (Mostrando solo productos con Stock)");
        System.out.println("=========================");

        int totalItems = 0;
        // El bucle usa automáticamente nuestro IteradorDisponible
        for (Producto p : almacen) {
            totalItems++;
            System.out.println(totalItems + ". " + p);
        }

        System.out.println("----------------------------");
        System.out.println("Modelos listos para venta: " + totalItems);
        System.out.println("============================");
    }
}