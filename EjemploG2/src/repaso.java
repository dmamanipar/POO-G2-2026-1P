import modelo.Persona;

public class repaso {
    // Tipo de datos primitivos
    static byte a=0;
    static short b=214;
    char c='H';
    int d=65435494;
    long e=445574;
    float f=245545244.4f;
    double g=576575.5555;
    boolean h=true;
    
    // Tipo de datos referenciales
    Persona p=new Persona("60313698","Braulio","Parra");

    public static int suma(){
        return a+b;
    }

    public static void main(String[] args){
        boolean suma;
        System.out.println(suma());
    }


}