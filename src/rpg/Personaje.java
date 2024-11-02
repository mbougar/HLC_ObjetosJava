package rpg;

public class Personaje {
    String nombre;
    int vida;

    public Personaje(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.nombre);
    }
}
