package rpg;

class Mago extends Personaje {
    public Mago(String nombre, int vida) {
        super(nombre, vida);
    }

    public void usarHechizo(Personaje enemigo, Hechizo hechizo) {
        System.out.println(nombre + " " + hechizo + " contra " + enemigo.nombre);
    }
}
