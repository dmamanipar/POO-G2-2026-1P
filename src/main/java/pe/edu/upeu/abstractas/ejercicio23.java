package pe.edu.upeu.abstractas;

// Clase Abstracta (Plantilla)
abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double calcularArea(); // Sin cuerpo, obligatorio para hijos
    public abstract double calcularPerimetro();

    public void mostrarDescripcion() {
        System.out.println("Figura " + color + " | Área: " + calcularArea());
    }
}

class Circulo extends Figura {
    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}

public class ejercicio23 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 23: CLASES ABSTRACTAS (FIGURAS) ---");
        // Figura f = new Figura("Rojo"); // Esto daría ERROR de compilación
        Circulo c = new Circulo("Verde", 5.0);
        c.mostrarDescripcion();
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}