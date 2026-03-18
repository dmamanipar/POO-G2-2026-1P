import modelo.Persona;

import java.util.ArrayList;

public class Erick202513364 {
    public static void main(String [] arg) {


        ArrayList<Persona> lista = new ArrayList();
        lista.add(new Persona( "6158799","anthony", "ccosi"));
        lista.add(new Persona( "6158798","erick", "ccosi"));
        lista.add(new Persona( "6158797","jorge", "ccosi"));

        for (Persona v:lista) {
            System.out.println(v);
        }
    }
}
