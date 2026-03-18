import modelo.Persona;

public class repaso {
    // datos primitivos
    static byte a = 2;
    static short b = 214;
    char c = 'H';
    int d = 5545456;
    long e = 555545455454544L;
    float f = 45454.4f;
    double g = 51351351.25656;
    boolean h = true;
    Persona p = new Persona("65090400", "JH", "Nina");
    String valor = "Repaso";
    Persona[] v = {};
    int[][] m = {{},{}}; // matriz 2x0

    public static int suma(){
        return a + b;
    }

    public static void main(String[] args){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        repaso obj = new repaso(); // necesario para campos no estáticos
        System.out.println("c = " + obj.c);
        System.out.println("d = " + obj.d);
        System.out.println("e = " + obj.e);
        System.out.println("f = " + obj.f);
        System.out.println("g = " + obj.g);
        System.out.println("h = " + obj.h);
        System.out.println("p = " + obj.p); // asume que Persona tiene toString()
        System.out.println("valor = " + obj.valor);
        System.out.println("suma = " + suma());
        System.out.println("v.length = " + obj.v.length);
        System.out.println("m.length = " + obj.m.length);

        // Para imprimir el contenido de m (aunque esté vacío)
        for (int i = 0; i < obj.m.length; i++) {
            System.out.println("m[" + i + "].length = " + obj.m[i].length);
        }
    }
}
