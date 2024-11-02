package biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Libro> libros = new ArrayList<>();
    ArrayList<Usuario> usuarios = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void prestarLibro(Usuario usuario, Libro libro) {
        libro.prestar();
    }
}
