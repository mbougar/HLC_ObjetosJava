package biblioteca;

public class Libro {
    String titulo;
    String autor;
    boolean prestado;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = false;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
            System.out.println("El libro " + titulo + " ha sido prestado.");
        } else {
            System.out.println("El libro " + titulo + " ya está prestado.");
        }
    }

    public void devolver() {
        prestado = false;
        System.out.println("El libro " + titulo + " ha sido devuelto.");
    }
}
