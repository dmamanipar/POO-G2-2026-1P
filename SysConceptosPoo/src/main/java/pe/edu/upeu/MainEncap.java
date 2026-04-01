package pe.edu.upeu;

import pe.edu.upeu.encapsulamiento.Persona;

public class MainEncap {
    public static void main(String[] args){
        Persona pobj=new Persona();
        pobj.setNombre("jh");
        pobj.setEdad(18);
        System.out.println(pobj.getNombre()+"\t"+pobj.getEdad());
    }
}
