package tareas;

import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Proyecto> proyectos = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public void crearProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }
}
