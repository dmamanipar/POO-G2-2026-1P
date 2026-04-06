package pe.edu.upeu.herencia;

class Personaje {
    protected String nombre;
    protected int vida, ataque, defensa;

    public Personaje(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public void atacar(Personaje enemigo) {
        int dano = Math.max(0, this.ataque - enemigo.defensa);
        enemigo.vida -= dano;
        System.out.println(this.nombre + " ataca a " + enemigo.nombre + " causando " + dano + " de daño.");
    }
}

class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vida, int ataque, int defensa, int mana) {
        super(nombre, vida, ataque, defensa);
        this.mana = mana;
    }

    public void lanzarHechizo(Personaje enemigo) {
        if (mana >= 20) {
            int danoMagico = this.ataque * 2;
            enemigo.vida -= danoMagico;
            this.mana -= 20;
            System.out.println(this.nombre + " lanza HECHIZO a " + enemigo.nombre + " causando " + danoMagico + " de daño!");
        } else {
            System.out.println(this.nombre + " no tiene suficiente maná.");
        }
    }
}

public class ejercicio14 {
    public static void main(String[] args) {
        System.out.println("--- EJERCICIO 14 (REF 16): COMBATE RPG ---");
        Personaje guerrero = new Personaje("Ragnar", 100, 20, 10);
        Mago mago = new Mago("Gandalf", 80, 15, 5, 50);

        mago.lanzarHechizo(guerrero);
        guerrero.atacar(mago);

        System.out.println("Vida de Ragnar: " + guerrero.vida);
        System.out.println("Vida de Gandalf: " + mago.vida);
    }
}