package pe.edu.upeu.internas;

import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class publicacionred {
    private String autor, contenido;
    private ArrayList<Comentario> comentarios = new ArrayList<>();

    public publicacionred(String autor, String contenido) {
        this.autor = autor;
        this.contenido = contenido;
    }

    // CLASE INTERNA: Representa un comentario que no existe sin un post
    class Comentario {
        private String texto, autorComentario;
        private String fecha;

        public Comentario(String texto, String autor) {
            this.texto = texto;
            this.autorComentario = autor;
            // Formateamos la fecha para que se vea bien en consola
            this.fecha = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        }

        public void enviarAlerta() {
            System.out.println("[NOTIFICACIÓN] -> Hola " + publicacionred.this.autor +
                    ", el usuario @" + autorComentario + " ha comentado tu publicación.");
        }

        @Override
        public String toString() {
            return "  └─ @" + autorComentario + ": \"" + texto + "\" (" + fecha + ")";
        }
    }

    public void nuevoComentario(String texto, String usuario) {
        Comentario c = new Comentario(texto, usuario);
        comentarios.add(c);
        c.enviarAlerta(); // La clase interna interactúa con la externa
    }

    public void mostrarMuro() {
        System.out.println("\n============================================");
        System.out.println("POST DE: " + autor.toUpperCase());
        System.out.println("CONTENIDO: " + contenido);
        System.out.println("============================================");
        System.out.println("COMENTARIOS (" + comentarios.size() + "):");
        for (Comentario c : comentarios) {
            System.out.println(c);
        }
        System.out.println("============================================\n");
    }

    public static void main(String[] args) {
        publicacionred miPost = new publicacionred("David_UPeU", "Aprendiendo Clases Internas en Java 🚀");

        // Agregamos comentarios e inmediatamente disparan notificaciones
        miPost.nuevoComentario("¡Excelente explicación!", "Juan_Dev");
        miPost.nuevoComentario("Java es un mundo fascinante.", "Maria_Code");
        miPost.nuevoComentario("¿Subirás esto a GitHub?", "Pedro99");

        // Mostramos todo el muro completo
        miPost.mostrarMuro();
    }
}