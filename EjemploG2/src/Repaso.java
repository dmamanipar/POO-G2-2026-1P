import modelo.Persona;

public class Repaso {

    static byte a=0;

    static short b=214;

    char c='h';

    int d=12313515;

    long e=1561566666;

    float f=165156.f;

    double g=16515156.555;

    boolean h=true;

    Persona p=new Persona("123", "carlos","mamani");

    String valor="Repaso";

    Persona[] v={};

    int[][] m={ {},{} };

    public static int suma(){
        return  a+b;
    }

    public static void main(String[] a){
        System.out.println(suma());



    }
}
