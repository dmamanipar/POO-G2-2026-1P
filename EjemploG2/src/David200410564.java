import modelo.Persona;

import java.util.ArrayList;

public class David200410564 {

    public static void main(String[] arg){

        Persona[] p=new Persona[3]; //Arrays Staticos
        p[0]=new Persona("43631917", "David", "Mamani");
        p[1]=new Persona("43631918", "Pedro", "Mamani");
        p[2]=new Persona("43631919", "Ruben", "Mamani");
        for (Persona v:p) {
            System.out.println(v.dni+"\t"+v.getNombre()+"\t"+v.getApellidos());
        }


        ArrayList<Persona> lista=new ArrayList<>(); //Array Dinamico
        lista.add(new Persona("43631917", "David", "Mamani"));
        lista.add(new Persona("43631918", "Pedro", "Mamani"));
        lista.add(new Persona("43631919", "Ruben", "Mamani"));

        for (Persona v:lista) {
            System.out.println(v.dni+"\t"+v.getNombre()+"\t"+v.getApellidos());
        }
        
    }

}
