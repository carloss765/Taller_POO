/**
 * Clase principal que demuestra el uso de la clase CD.
 * Muestra las operaciones básicas de gestión de canciones en un CD,
 * incluyendo agregar, eliminar, modificar y mostrar canciones.
 */
public class App {
    /**
     * Método principal que ejecuta la demostración de la clase CD.
     * Crea un CD y realiza varias operaciones con canciones para
     * mostrar la funcionalidad completa de la clase.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // SECCIÓN 1: Creación del CD y canciones iniciales
        // Crear una nueva instancia de CD vacío
        CD miCD = new CD();

        // Crear varias canciones con sus títulos y autores
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen");
        Cancion cancion2 = new Cancion("Imagine", "John Lennon");
        Cancion cancion3 = new Cancion("Hotel California", "Eagles");

        // SECCIÓN 2: Agregar canciones al CD
        // Añadir las canciones creadas al CD usando el método agrega
        miCD.agrega(cancion1);
        miCD.agrega(cancion2);
        miCD.agrega(cancion3);

        // SECCIÓN 3: Mostrar contenido inicial del CD
        // Visualizar todas las canciones almacenadas
        System.out.println("Canciones en el CD:");
        miCD.mostrarCanciones();

        // Mostrar el número total de canciones en el CD
        System.out.println("Número de canciones: " + miCD.numeroCanciones());

        // SECCIÓN 4: Acceso a canciones específicas
        // Obtener y mostrar la canción en la posición 1
        System.out.println("Canción en la posición 1: " + miCD.dameCancion(1).toString());

        // SECCIÓN 5: Modificación de canciones
        // Crear una nueva canción para reemplazar una existente
        Cancion nuevaCancion = new Cancion("Stairway to Heaven", "Led Zeppelin");
        // Reemplazar la canción en la posición 1
        miCD.grabaCancion(1, nuevaCancion);
        // Mostrar el contenido actualizado del CD
        System.out.println("Después de grabar una nueva canción:");
        miCD.mostrarCanciones();

        // SECCIÓN 6: Eliminación de canciones
        // Eliminar la primera canción del CD (posición 0)
        miCD.elimina(0);
        // Mostrar el contenido final del CD
        System.out.println("Después de eliminar la primera canción:");
        miCD.mostrarCanciones();
    }
}