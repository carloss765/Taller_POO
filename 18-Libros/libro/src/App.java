import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Libros libros = new Libros();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Insertar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Obtener libro");
            System.out.println("4. Buscar libro");
            System.out.println("5. Conocer el número de libros");
            System.out.println("6. Imprimir lista de libros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el título del libro: ");
                    String titulo = scanner.nextLine();
                    libros.insertarLibro(new Libro(titulo));
                    System.out.println("Libro insertado.");
                    break;
                case 2:
                    System.out.print("Ingrese la posición del libro a eliminar: ");
                    int posicionEliminar = scanner.nextInt();
                    libros.eliminarLibro(posicionEliminar);
                    System.out.println("Libro eliminado.");
                    break;
                case 3:
                    System.out.print("Ingrese la posición del libro a obtener: ");
                    int posicionObtener = scanner.nextInt();
                    Libro libro = libros.obtenerLibro(posicionObtener);
                    if (libro != null) {
                        System.out.println("Libro en la posición " + posicionObtener + ": " + libro);
                    }
                    break;
                case 4:
                    System.out.print("Ingrese parte del título del libro a buscar: ");
                    String parteTitulo = scanner.nextLine();
                    int posicionBuscar = libros.buscarLibro(parteTitulo);
                    if (posicionBuscar != -1) {
                        System.out.println("El libro que contiene '" + parteTitulo + "' está en la posición: " + posicionBuscar);
                    } else {
                        System.out.println("No se encontró un libro que contenga '" + parteTitulo + "'");
                    }
                    break;
                case 5:
                    System.out.println("Número de libros: " + libros.numeroDeLibros());
                    break;
                case 6:
                    System.out.println("Lista de libros:");
                    libros.imprimirLista();
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
        //Hecho por brahian
    }
}
