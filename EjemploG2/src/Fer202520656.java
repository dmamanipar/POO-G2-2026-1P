import modelo.Persona;

import javax.swing.*;
import java.util.ArrayList;

public class Fer202520656 {

    public static void main(String[] args){

        ArrayList<Persona> lista=new ArrayList<>();
        lista.add(new Persona("74958840", "Fernando", "Apaza"));
        lista.add(new Persona("60558566", "Maryori", "Apaza"));
        lista.add(new Persona("10525661", "Asunta", "Apaza"));

        for (Persona v:lista) {
            System.out.println(v);
        }
    }
}
