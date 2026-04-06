package pe.edu.upeu.herencia;

// Clase Padre
class Empleado {
    protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }
}

// Clase Hija
class Gerente extends Empleado {
    private double bonoGerencial;

    public Gerente(String nombre, double salarioBase, double bonoGerencial) {
        super(nombre, salarioBase);
        this.bonoGerencial = bonoGerencial;
    }

    @Override
    public double calcularSalario() {
        // Reutiliza la lógica del padre con super
        return super.calcularSalario() + bonoGerencial;
    }
}

public class ejercicio13 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 13: NÓMINA CON HERENCIA ---");
        Gerente g1 = new Gerente("Ana Lopez", 3000, 1500);
        System.out.println("Empleado: " + g1.nombre);
        System.out.println("Salario Total con Bono: $" + g1.calcularSalario());
    }
}