/**
 * Clase principal que demuestra el uso de la clase Cancion.
 * Incluye ejemplos de creación, modificación y visualización de canciones
 * utilizando diferentes constructores y métodos.
 */
public class App {
    /**
     * Método principal que ejecuta una serie de pruebas para demostrar
     * la funcionalidad de la clase Cancion.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // SECCIÓN 1: Creación de canción usando constructor con parámetros
        // Crea una canción con título y autor definidos directamente
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen");
        // Muestra la información completa de la primera canción
        System.out.println("Canción 1: " + cancion1.toString());

        // SECCIÓN 2: Creación de canción usando constructor predeterminado
        // Crea una canción con valores vacíos por defecto
        Cancion cancion2 = new Cancion();
        // Muestra el estado inicial de la segunda canción (valores vacíos)
        System.out.println("Canción 2 (inicial): " + cancion2.toString());

        // SECCIÓN 3: Modificación de canción usando métodos setter
        // Establece el título y autor de la segunda canción
        cancion2.ponTitulo("Imagine");
        cancion2.ponAutor("John Lennon");
        // Muestra la información actualizada de la segunda canción
        System.out.println("Canción 2 (actualizada): " + cancion2.toString());

        // SECCIÓN 4: Obtención de datos usando métodos getter
        // Demuestra cómo obtener título y autor individualmente
        System.out.println("Título de la canción 1: " + cancion1.dameTitulo());
        System.out.println("Autor de la canción 1: " + cancion1.dameAutor());
    }
}