import modelo.Persona;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class williams202511799 {

    public static void main(String[] arg){
    Persona[] p=new Persona[3];
    ArrayList<Persona> Lista = new ArrayList<>();

      Lista.add(new Persona("60507026"));
      Lista.add(new Persona("60507026"));
      Lista.add(new Persona("60507026"));


        for (Persona v: Lista) {
            System.out.println(v);

        }
    }
}