package pe.edu.upeu.enums;

// 1. Definición del enum Operacion
enum Operacion {
    SUMA("+") {
        @Override
        public double calcular(double a, double b) {
            return a + b;
        }
    },
    RESTA("-") {
        @Override
        public double calcular(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICACION("*") {
        @Override
        public double calcular(double a, double b) {
            return a * b;
        }
    },
    DIVISION("/") {
        @Override
        public double calcular(double a, double b) {
            if (b == 0) {
                throw new ArithmeticException("División por cero no permitida.");
            }
            return a / b;
        }
    };

    private String simbolo; // Atributo para el símbolo de la operación

    // Constructor del enum
    Operacion(String simbolo) {
        this.simbolo = simbolo;
    }

    // Método para obtener el símbolo de la operación
    public String getSimbolo() {
        return simbolo;
    }

    // Método abstracto que cada constante deberá implementar
    public abstract double calcular(double a, double b);
}

// 2. Clase principal para usar la calculadora
public class ejercicio34 { // Cambié el nombre de la clase a ejercicio34 para seguir la numeración
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 34: CALCULADORA CON OPERACIONES ENUM ---");

        double num1 = 10.0;
        double num2 = 5.0;

        // Probando la suma
        Operacion suma = Operacion.SUMA;
        System.out.println(num1 + " " + suma.getSimbolo() + " " + num2 + " = " + suma.calcular(num1, num2)); // 10.0 + 5.0 = 15.0

        // Probando la resta
        Operacion resta = Operacion.RESTA;
        System.out.println(num1 + " " + resta.getSimbolo() + " " + num2 + " = " + resta.calcular(num1, num2)); // 10.0 - 5.0 = 5.0

        // Probando la multiplicación
        Operacion multiplicacion = Operacion.MULTIPLICACION;
        System.out.println(num1 + " " + multiplicacion.getSimbolo() + " " + num2 + " = " + multiplicacion.calcular(num1, num2)); // 10.0 * 5.0 = 50.0

        // Probando la división
        Operacion division = Operacion.DIVISION;
        System.out.println(num1 + " " + division.getSimbolo() + " " + num2 + " = " + division.calcular(num1, num2)); // 10.0 / 5.0 = 2.0

        // Probando la división por cero (debería lanzar una excepción)
        double num3 = 10.0;
        double num4 = 0.0;
        try {
            System.out.println(num3 + " " + division.getSimbolo() + " " + num4 + " = " + division.calcular(num3, num4));
        } catch (ArithmeticException e) {
            System.out.println("Error en división: " + e.getMessage()); // Error en división: División por cero no permitida.
        }
    }
}