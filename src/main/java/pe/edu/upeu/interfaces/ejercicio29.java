package pe.edu.upeu.interfaces;

interface Pagable {
    double calcularMonto();
}

interface Imprimible {
    void imprimir();
}

// Una sola clase cumple dos contratos distintos
class Factura implements Pagable, Imprimible {
    private int id;
    private double monto;

    public Factura(int id, double monto) {
        this.id = id;
        this.monto = monto;
    }

    @Override
    public double calcularMonto() {
        return monto * 1.18; // Monto con IGV
    }

    @Override
    public void imprimir() {
        System.out.println("Factura N°: " + id + " | Total a pagar: $" + calcularMonto());
    }
}

public class ejercicio29 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 29: MÚLTIPLES INTERFACES ---");
        Factura f1 = new Factura(501, 200.0);
        f1.imprimir();
    }
}