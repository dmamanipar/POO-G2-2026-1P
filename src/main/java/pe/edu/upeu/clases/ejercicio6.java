package pe.edu.upeu.clases;

import java.util.ArrayList;

public class ejercicio6 {
    private String titular;
    private double saldo;
    private ArrayList<String> movimientos = new ArrayList<>();

    // Constructor para inicializar la cuenta
    public ejercicio6(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.movimientos.add("Apertura de cuenta: $" + saldoInicial);
    }

    public boolean retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            movimientos.add("Retiro: -$" + monto);
            return true;
        }
        return false;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            movimientos.add("Depósito: +$" + monto);
        }
    }

    public void mostrarEstado() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo actual: $" + saldo);
        System.out.println("Movimientos: " + movimientos);
    }

    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 6: CUENTA BANCARIA ---");
        ejercicio6 cuenta = new ejercicio6("Andy Ccaza Atamari", 1000.0);
        cuenta.depositar(500);
        cuenta.retirar(200);
        cuenta.mostrarEstado();
    }
}