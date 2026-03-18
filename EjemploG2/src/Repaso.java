import modelo.Persona;

public class Repaso {

    static byte a=0;
    static short b=214;
    static char c='h';
    static int d=23423443;
    static long e=1342353531234123423L;
    static float f=234543463.4f;
    static double g=123234.123;
    static boolean h=true;

    Persona p=new Persona("123124","Carlitos","Quispe");
    String valor="Repaso";
    Persona[] v={};
    int [][] m={{},{}};

    public static int suma(){

        return a+b;
    }
    public static void main(String[] a){
        System.out.println(suma());

    }
}
