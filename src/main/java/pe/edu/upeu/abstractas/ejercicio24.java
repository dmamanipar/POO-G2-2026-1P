package pe.edu.upeu.abstractas;

abstract class Envio {
    protected double peso;
    protected double distancia;

    public Envio(double peso, double distancia) {
        this.peso = peso;
        this.distancia = distancia;
    }

    public abstract double calcularCosto();
    public abstract int calcularTiempoHoras();

    // Método concreto que usa los abstractos (Template Method)
    public void generarGuia() {
        System.out.println("GUÍA DE ENVÍO:");
        System.out.println("Costo: $" + calcularCosto());
        System.out.println("Tiempo estimado: " + calcularTiempoHoras() + " horas");
    }
}

class EnvioAereo extends Envio {
    public EnvioAereo(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularCosto() {
        return peso * distancia * 0.05;
    }

    @Override
    public int calcularTiempoHoras() {
        return (int) (distancia / 800);
    }
}

public class ejercicio24 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 24: SISTEMA DE ENVÍOS ---");
        EnvioAereo express = new EnvioAereo(10.5, 2500);
        express.generarGuia();
    }
}