import modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class RUBEN202514032 {
    public static void main(String[] arg){

        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona("24057982","ruben","mamani"));
        lista.add(new Persona("24057982","ruben","mamani"));
        lista.add(new Persona("24057982","ruben","mamani"));

        for (Persona v:lista) {
            System.out.println(v.dni+"");

        }
    }

}
-