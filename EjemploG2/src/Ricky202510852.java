import modelo.Persona;

import java.util.ArrayList;

public class Ricky202510852 {
    public static void main(String[] args) {

        Persona[] p=new Persona[3];
        p[0]=new Persona("123", "carlos","mamani");
        p[1]=new Persona("124", "carlo","mamani");
        p[2]=new Persona("125", "carl","mamani");

        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona("123", "carlos","mamani"));
        lista.add(new Persona("124", "carlo","mamani"));
        lista.add(new Persona("125", "carl","mamani"));
        for (Persona v:lista) {
            System.out.println(v);
        }
    }

}
