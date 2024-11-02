package estudiantes;

public class Profesor {
    String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public void asignarCurso(Estudiante estudiante, Curso curso) {
        estudiante.cursos.add(curso);
    }
}
