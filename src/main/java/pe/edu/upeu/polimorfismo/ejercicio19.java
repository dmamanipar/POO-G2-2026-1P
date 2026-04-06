package pe.edu.upeu.polimorfismo;

import java.util.ArrayList;

class CalculadoraImpuesto {
    protected String pais;

    public CalculadoraImpuesto(String pais) {
        this.pais = pais;
    }

    public double calcularImpuesto(double monto) {
        return 0;
    }
}

class ImpuestoMexico extends CalculadoraImpuesto {
    public ImpuestoMexico() { super("México"); }

    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.16; // IVA 16%
    }
}

class ImpuestoEspana extends CalculadoraImpuesto {
    public ImpuestoEspana() { super("España"); }

    @Override
    public double calcularImpuesto(double monto) {
        return monto * 0.21; // IVA 21%
    }
}

public class ejercicio19 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 19: IMPUESTOS POR PAÍS ---");
        ArrayList<CalculadoraImpuesto> lista = new ArrayList<>();
        lista.add(new ImpuestoMexico());
        lista.add(new ImpuestoEspana());

        double venta = 1000;
        for (CalculadoraImpuesto c : lista) {
            System.out.println("Impuesto en " + c.pais + " por una venta de $" + venta + ": $" + c.calcularImpuesto(venta));
        }
    }
}