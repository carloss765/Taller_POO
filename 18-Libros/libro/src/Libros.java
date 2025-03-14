import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Clase que gestiona una colección ordenada de libros.
 * Proporciona funcionalidades para insertar, eliminar, buscar y listar libros,
 * manteniendo la colección ordenada alfabéticamente por título.
 */
public class Libros {
    /** Lista que almacena los libros ordenados alfabéticamente */
    private List<Libro> listaLibros;

    /**
     * Constructor que inicializa una nueva colección vacía de libros.
     * Crea un ArrayList para almacenar los libros.
     */
    public Libros() {
        listaLibros = new ArrayList<>();
    }

    /**
     * Obtiene el número total de libros en la colección.
     *
     * @return cantidad de libros almacenados
     */
    public int numeroDeLibros() {
        return listaLibros.size();
    }

    /**
     * Inserta un nuevo libro en la colección y mantiene el orden alfabético.
     * Utiliza el método sort de Collections para ordenar la lista después de la inserción.
     *
     * @param libro nuevo libro a insertar en la colección
     */
    public void insertarLibro(Libro libro) {
        listaLibros.add(libro);
        Collections.sort(listaLibros);  // Ordena la lista usando el compareTo de Libro
    }

    /**
     * Elimina el libro ubicado en la posición especificada.
     * Verifica que la posición sea válida antes de realizar la eliminación.
     *
     * @param posicion índice del libro a eliminar (0-based)
     */
    public void eliminarLibro(int posicion) {
        if (posicion >= 0 && posicion < listaLibros.size()) {
            listaLibros.remove(posicion);
        } else {
            System.out.println("Posición no válida");
        }
    }

    /**
     * Obtiene el libro ubicado en la posición especificada.
     *
     * @param posicion índice del libro a obtener (0-based)
     * @return el libro en la posición indicada o null si la posición no es válida
     */
    public Libro obtenerLibro(int posicion) {
        if (posicion >= 0 && posicion < listaLibros.size()) {
            return listaLibros.get(posicion);
        } else {
            System.out.println("Posición no válida");
            return null;
        }
    }

    /**
     * Busca un libro por una parte de su título.
     * La búsqueda es insensible a mayúsculas/minúsculas.
     *
     * @param parteTitulo fragmento del título a buscar
     * @return índice del primer libro que contiene el texto buscado, o -1 si no se encuentra
     */
    public int buscarLibro(String parteTitulo) {
        for (int i = 0; i < listaLibros.size(); i++) {
            // Convertir ambos textos a minúsculas para la comparación
            if (listaLibros.get(i).getTitulo().toLowerCase().contains(parteTitulo.toLowerCase())) {
                return i;
            }
        }
        return -1;  // Retorna -1 si no encuentra coincidencias
    }

    /**
     * Muestra todos los libros de la colección.
     * Imprime cada libro en una línea separada usando su método toString.
     */
    public void imprimirLista() {
        for (Libro libro : listaLibros) {
            System.out.println(libro);
        }
    }
}