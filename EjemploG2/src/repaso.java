import modelo.Persona;

public class repaso {
    //tipos de datos Primitivo
    static byte a=2;
   static short b=214;
    char c='H';
    int d=54545451;
    long e=54545454545454L;
    float f=5454545.4f;
    double g=5454545.222;
    boolean h=true;
    //tipos de datos referenciales
    Persona p=new Persona("43631917","Erick", "Apaza");
    String valor="Repaso";
    Persona[] v={};
    int[][] m={{},{}};

    public static int suma(){
        return a+b;
    }

    public static void main(String[] a) {
        System.out.println(suma());


    }
}
