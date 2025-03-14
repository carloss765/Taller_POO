/**
 * Clase que representa un libro con su título.
 * Implementa Comparable para permitir la ordenación de libros
 * basada en sus títulos de manera alfabética, ignorando mayúsculas/minúsculas.
 *
 * @author Brahian
 */
public class Libro implements Comparable<Libro> {
    /** Título del libro */
    private String titulo;

    /**
     * Constructor que crea un libro con el título especificado.
     *
     * @param titulo título del libro a crear
     */
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return título actual del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece o modifica el título del libro.
     *
     * @param titulo nuevo título para el libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Compara este libro con otro basándose en sus títulos.
     * La comparación ignora mayúsculas/minúsculas.
     *
     * @param otro libro con el que comparar
     * @return negativo si este libro va antes, positivo si va después,
     *         cero si son iguales ignorando mayúsculas/minúsculas
     */
    @Override
    public int compareTo(Libro otro) {
        return this.titulo.compareToIgnoreCase(otro.titulo);
    }

    /**
     * Devuelve una representación en texto del libro.
     *
     * @return cadena con el formato "Libro{titulo='[título]'}"
     */
    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                '}';
    }
}