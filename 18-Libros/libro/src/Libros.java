import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libros {
    private List<Libro> listaLibros;

    public Libros() {
        listaLibros = new ArrayList<>();
    }

    // Conocer el número de libros que hay en la lista
    public int numeroDeLibros() {
        return listaLibros.size();
    }

    // Insertar un nuevo libro en la posición que le corresponda
    public void insertarLibro(Libro libro) {
        listaLibros.add(libro);
        Collections.sort(listaLibros);
    }

    // Eliminar el libro de una determinada posición
    public void eliminarLibro(int posicion) {
        if (posicion >= 0 && posicion < listaLibros.size()) {
            listaLibros.remove(posicion);
        } else {
            System.out.println("Posición no válida");
        }
    }

    // Obtener el libro de una determinada posición
    public Libro obtenerLibro(int posicion) {
        if (posicion >= 0 && posicion < listaLibros.size()) {
            return listaLibros.get(posicion);
        } else {
            System.out.println("Posición no válida");
            return null;
        }
    }

    // Buscar un libro a partir de una parte de su título
    public int buscarLibro(String parteTitulo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getTitulo().toLowerCase().contains(parteTitulo.toLowerCase())) {
                return i;
            }
        }
        return -1;
    }

    // Método para imprimir la lista de libros
    public void imprimirLista() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }

}