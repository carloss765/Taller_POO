/**
 * Clase que representa una canción con su información básica.
 * Almacena y gestiona el título y el autor de una canción,
 * proporcionando métodos para acceder y modificar estos datos.
 */
public class Cancion {
    /**
     * Título de la canción.
     * Almacena el nombre o título de la pieza musical.
     */
    private String titulo;

    /**
     * Autor de la canción.
     * Almacena el nombre del compositor o intérprete de la canción.
     */
    private String autor;

    /**
     * Constructor que crea una canción con título y autor especificados.
     * Permite inicializar una canción con todos sus datos.
     *
     * @param titulo el título de la canción
     * @param autor el nombre del autor o intérprete
     */
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /**
     * Constructor predeterminado.
     * Crea una nueva canción con título y autor vacíos.
     * Los valores se pueden establecer posteriormente usando los métodos set.
     */
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    /**
     * Obtiene el título de la canción.
     *
     * @return el título actual de la canción
     */
    public String dameTitulo() {
        return titulo;
    }

    /**
     * Obtiene el autor de la canción.
     *
     * @return el nombre del autor o intérprete actual
     */
    public String dameAutor() {
        return autor;
    }

    /**
     * Establece o modifica el título de la canción.
     *
     * @param titulo el nuevo título para la canción
     */
    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Establece o modifica el autor de la canción.
     *
     * @param autor el nuevo autor o intérprete para la canción
     */
    public void ponAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Devuelve una representación en texto de la canción.
     * Genera una cadena que incluye tanto el título como el autor
     * en un formato legible y organizado.
     *
     * @return una cadena con el formato "Canción: [título] - Autor: [autor]"
     */
    @Override
    public String toString() {
        return "Canción: " + titulo + " - Autor: " + autor;
    }
}