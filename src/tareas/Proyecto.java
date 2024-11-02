package tareas;

import java.util.ArrayList;

public class Proyecto {
    String nombre;
    ArrayList<Tarea> tareas = new ArrayList<>();

    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void mostrarTareas() {
        for (Tarea tarea : tareas) {
            System.out.println("Tarea: " + tarea.descripcion + " - " + (tarea.completada ? "Completada" : "Pendiente"));
        }
    }
}
