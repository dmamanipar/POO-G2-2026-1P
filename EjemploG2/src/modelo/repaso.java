package modelo;

public class repaso {

    static byte a=2;

    static short b=214;

    char c='H';

    int d=545454511;

    long e=5454545444L;

    float f=1545454.4f;

    double g=5454545.222;

    boolean h=true;
    //tipos de datos referenciados

    Persona p=new Persona("","","");

    String valor="Repaso";

    Persona[] v={};

    int[][] m={{},{}};


    public static int suma(){
        return  a+b;
    }


    public static void main(String[] a) {
        System.out.println(suma());

    }
}
