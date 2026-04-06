package pe.edu.upeu.polimorfismo;

import java.util.ArrayList;

class Notificacion {
    protected String destinatario;

    public Notificacion(String destinatario) {
        this.destinatario = destinatario;
    }

    public void enviar() {
        System.out.println("Enviando notificación base a: " + destinatario);
    }
}

class NotifEmail extends Notificacion {
    private String asunto;

    public NotifEmail(String destinatario, String asunto) {
        super(destinatario);
        this.asunto = asunto;
    }

    @Override
    public void enviar() {
        System.out.println("📧 EMAIL a " + destinatario + " | Asunto: " + asunto);
    }
}

class NotifSMS extends Notificacion {
    public NotifSMS(String destinatario) {
        super(destinatario);
    }

    @Override
    public void enviar() {
        System.out.println("📱 SMS al número de " + destinatario + " [Cifrado]");
    }
}

public class ejercicio18 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 18: POLIMORFISMO DE NOTIFICACIONES ---");
        ArrayList<Notificacion> pendientes = new ArrayList<>();

        pendientes.add(new NotifEmail("profe@upeu.edu", "Tarea de POO"));
        pendientes.add(new NotifSMS("987654321"));

        // Polimorfismo: el mismo bucle llama a distintos enviar()
        for (Notificacion n : pendientes) {
            n.enviar();
        }
    }
}