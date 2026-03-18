import modelo.Persona;

import java.util.ArrayList;

public class Midward202510871 {

    public static void main(String[] args) {

        Persona[] p=new Persona[3];
        p[0]=new Persona("","","");
        p[1]=new Persona("","","");
        p[2]=new Persona("","","");


        ArrayList<Persona> lista=new ArrayList();
        lista.add(new Persona("60523214","midward","calsina"));
        lista.add(new Persona("","",""));
        lista.add(new Persona("","",""));

        for (Persona v:lista) {
            System.out.println(v);
        }
    }
}
