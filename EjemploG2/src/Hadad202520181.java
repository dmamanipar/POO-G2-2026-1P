import modelo.Persona;

import java.util.ArrayList;

public class Hadad202520181 {
    public static void main(String[] arg){

        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona("134356","Pedro","Q"));
        lista.add(new Persona("346456","Juan","M"));
        lista.add(new Persona("867567","Marco","Q"));

        for (Persona v:lista){
            System.out.println(v.dni);
        }
    }
}
