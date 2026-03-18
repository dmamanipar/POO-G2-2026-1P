import modelo.Persona;

public class repaso {

   static byte a=0;

    static short b=214;

    char c='h';

    int d=345455454;

    long e=55654556L;

    float f=465756.4f;

    double g=46546.222;

    boolean h=true;
    //Tipos de datos referenciados
    Persona p=new Persona("61158799","anthony","sucapuca");

    public  static int suma(){
        return a+b;
    }
    public  static void main(String[] a){
        System.out.println(suma());
    }

}
