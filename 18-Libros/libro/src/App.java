import java.util.Scanner;

/**
 * Clase principal que implementa un sistema de gestión de libros.
 * Proporciona un menú interactivo para realizar operaciones básicas
 * como insertar, eliminar, buscar y listar libros.
 *
 * @author Brahian
 */
public class App {
    /**
     * Método principal que ejecuta el sistema de gestión de libros.
     * Presenta un menú interactivo con opciones para manipular la colección de libros.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // Inicialización de objetos principales
        Libros libros = new Libros();          // Crear nueva colección de libros
        Scanner scanner = new Scanner(System.in); // Scanner para entrada de usuario
        int opcion;                            // Variable para almacenar la opción del menú

        // Bucle principal del programa
        do {
            // Mostrar menú de opciones
            System.out.println("\nMenú:");
            System.out.println("1. Insertar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Obtener libro");
            System.out.println("4. Buscar libro");
            System.out.println("5. Conocer el número de libros");
            System.out.println("6. Imprimir lista de libros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1: // Insertar nuevo libro
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    libros.insertarLibro(new Libro(titulo));
                    System.out.println("Libro insertado.");
                    break;

                case 2: // Eliminar libro existente
                    System.out.print("Ingrese la posición del libro a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    libros.eliminarLibro(posicionEliminar);
                    System.out.println("Libro eliminado.");
                    break;

                case 3: // Obtener información de un libro
                    System.out.print("Ingrese la posición del libro a obtener: ");
                    int posicionObtener = scanner.nextInt();
                    Libro libro = libros.obtenerLibro(posicionObtener);
                    if (libro != null) {
                        System.out.println("Libro en la posición " + posicionObtener + ": " + libro);
                    }
                    break;

                case 4: // Buscar libro por título
                    System.out.print("Ingrese parte del título del libro a buscar: ");
                    String parteTitulo = scanner.nextLine();
                    int posicionBuscar = libros.buscarLibro(parteTitulo);
                    if (posicionBuscar != -1) {
                        System.out.println("El libro que contiene '" + parteTitulo + "' está en la posición: " + posicionBuscar);
                    } else {
                        System.out.println("No se encontró un libro que contenga '" + parteTitulo + "'");
                    }
                    break;

                case 5: // Mostrar cantidad total de libros
                    System.out.println("Número de libros: " + libros.numeroDeLibros());
                    break;

                case 6: // Mostrar lista completa de libros
                    System.out.println("Lista de libros:");
                    libros.imprimirLista();
                    break;

                case 0: // Salir del programa
                    System.out.println("Saliendo...");
                    break;

                default: // Opción no válida
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0); // Continuar hasta que el usuario elija salir

        // Cerrar el scanner al finalizar
        scanner.close();
    }
}