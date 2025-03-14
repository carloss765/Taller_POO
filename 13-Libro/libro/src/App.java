/**
 * Clase principal que demuestra el uso de la clase Libro.
 * Incluye ejemplos de creación de libros con datos predefinidos y
 * lectura interactiva de información de libros.
 */
public class App {
    /**
     * Método principal que ejecuta pruebas de la clase Libro.
     * Demuestra dos formas de crear y mostrar información de libros:
     * 1. Creación con datos predefinidos
     * 2. Lectura interactiva de datos
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // SECCIÓN 1: Creación de libro con datos predefinidos
        // Crear una fecha de edición específica
        Fecha fechaEdicion = new Fecha(16, 11, 2001);

        // Crear un autor con nombre y apellido
        Persona autor = new Persona("Y. Daniel", "Liang");

        // Crear un libro con todos sus datos
        // Se proporciona título, autor, ISBN, número de páginas,
        // edición, editorial, ciudad, país y fecha de edición
        Libro libro = new Libro(
            "Introduction to Java Programming",  // Título del libro
            autor,                              // Objeto autor creado previamente
            "0-13-031997-X",                   // ISBN del libro
            784,                               // Número de páginas
            3,                                 // Número de edición
            "Prentice-Hall",                   // Editorial
            "New Jersey",                      // Ciudad de publicación
            "USA",                             // País de publicación
            fechaEdicion                       // Objeto fecha creado previamente
        );

        // Mostrar la información del libro creado
        System.out.println("Información del libro predefinido:");
        libro.mostrar();

        // SECCIÓN 2: Creación de libro mediante entrada de usuario
        // Crear un nuevo libro con valores iniciales vacíos o por defecto
        Libro nuevoLibro = new Libro("", null, "", 0, 0, "", "", "", new Fecha(1, 1, 1900));

        // Solicitar al usuario que ingrese los datos del libro
        System.out.println("\nPor favor, ingrese los datos del nuevo libro:");
        nuevoLibro.leer();

        // Mostrar la información del libro ingresado por el usuario
        System.out.println("\nInformación del libro ingresado:");
        nuevoLibro.mostrar();
    }
}