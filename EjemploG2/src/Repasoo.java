import modelo.Persona;

public class Repasoo {
    // Tipos de datos primitivos
    static byte a=0;

    static short b=214;

    char c='H';

    int d=15656151;

    long e=6151323;

    float f=156116516.4f;

    double g=652526.222;

    boolean h=true;

    //Tipos de datos referencias
    Persona p=new Persona("74958840","Fernando","Apaza");
    String valor="Repaso";
    Persona [] v={};
    int [][] m={{},{}};

    public Repasoo(char c, int[][] m, Persona[] v, String valor, boolean h, Persona p, double g, float f, long e, int d) {
        this.c = c;
        this.m = m;
        this.v = v;
        this.valor = valor;
        this.h = h;
        this.p = p;
        this.g = g;
        this.f = f;
        this.e = e;
        this.d = d;
    }

    public static int suma(){
        return a+b;


    }



   public static void main(String [] a){
       System.out.println(suma());

   }




}
