import modelo.Persona;

import java.util.ArrayList;

public class Erick202520643 {

    public static void main(String[] arg) {

        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona("43631917", "Erick", "Apaza"));
        lista.add(new Persona("43631912", "Abel", "Condori"));
        lista.add(new Persona("43631915", "Kevin", "Quispe"));

        for (Persona v:lista){
            System.out.println(v);
        }

    }
}
