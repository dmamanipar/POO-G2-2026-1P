import modelo.Persona;

public class Repaso {
    //Tipos de datos Primitivo
   static byte a=2;
   static short b=214;
    char c='H';
    int d=545454511;
    long e=545454544454545454L;
    float f=1545454.4f;
    double g=5454545.222;
    boolean h=true;
    //Tipos de datos referenciados
    Persona p=new Persona("43631917","David", "Mamani");
    String valor="Repaso";
    Persona[] v={};
    int[][]  m={{},{}};

    public static int suma(){
        return  a+b;
    }

    public static void main(String[] a){
        System.out.println(suma());
    }

}
