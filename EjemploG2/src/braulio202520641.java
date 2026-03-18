import modelo.Persona;

import java.util.ArrayList;

public class braulio202520641 {
    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();
        lista.add(new Persona("60313698","Braulio","Parra"));
        lista.add(new Persona("545551","Fernando","Murga"));
        lista.add(new Persona("3545225","Noeli","Apaza"));

        for (Persona v:lista){
        System.out.println(v);
        }

    }
}
