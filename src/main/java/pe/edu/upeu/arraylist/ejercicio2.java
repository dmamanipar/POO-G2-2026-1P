package pe.edu.upeu.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 2: TEMPERATURAS ---");
        ArrayList<Double> temps = new ArrayList<>(Arrays.asList(28.5, 31.2, 29.8, 33.1, 30.5, 27.4, 35.0));

        double max = Collections.max(temps);
        double min = Collections.min(temps);
        double promedio = temps.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println("Registro: " + temps);
        System.out.println("Máxima: " + max + "°C | Mínima: " + min + "°C");
        System.out.printf("Promedio: %.2f°C\n", promedio);
    }
}