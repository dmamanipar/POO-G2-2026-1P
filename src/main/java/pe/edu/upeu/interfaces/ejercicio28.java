package pe.edu.upeu.interfaces;

// El Contrato
interface Conectable {
    void conectar();
    void desconectar();
    boolean estaConectado();
}

class Teclado implements Conectable {
    private boolean conectado = false;

    @Override
    public void conectar() {
        conectado = true;
        System.out.println("Teclado conectado por USB.");
    }

    @Override
    public void desconectar() {
        conectado = false;
        System.out.println("Teclado desconectado.");
    }

    @Override
    public boolean estaConectado() {
        return conectado;
    }
}

public class ejercicio28 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 28: INTERFACES (USB) ---");
        Conectable miTeclado = new Teclado();
        miTeclado.conectar();
        System.out.println("¿Está funcionando?: " + miTeclado.estaConectado());
    }
}