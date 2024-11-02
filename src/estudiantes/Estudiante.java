package estudiantes;

import java.util.ArrayList;

public class Estudiante {
    String nombre;
    ArrayList<Curso> cursos = new ArrayList<>();

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public double calcularPromedio() {
        int suma = 0;
        for (Curso curso : cursos) {
            suma += curso.calificacion;
        }
        return cursos.size() > 0 ? suma / cursos.size() : 0;
    }
}
