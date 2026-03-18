import modelo.Persona;

import java.util.ArrayList;

public class Jhonatan202520668 {
    public static void main(String[] args) {
        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona( "65090400", "Jh", "Nina"));
        lista.add(new Persona(  "65090400", "Jh",  "Nina"));
        lista.add(new Persona( "65090400", "Jh", "Nina"));

        for (Persona v:lista) {
            System.out.println();
        }
    }
}
