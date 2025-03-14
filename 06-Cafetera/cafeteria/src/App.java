// Importamos Scanner para leer entrada del usuario
import java.util.Scanner;

/**
 * Clase principal que implementa un sistema de gestión de cafetera
 */
public class App {
    /**
     * Método principal que ejecuta el programa de la cafetera
     * @param args Argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) throws Exception {
        // Bucle principal que mantiene el programa en ejecución
        while (true) {
            // Muestra el título del programa
            System.out.println("---- Cafetera ----");

            // Crea una nueva cafetera con capacidad máxima de 1000 unidades
            Cafetera cafetera = new Cafetera(1000);

            // Muestra el menú de opciones disponibles
            System.out.println("Qué desea hacer?");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Café");

            // Crea un Scanner para leer la entrada del usuario
            Scanner sc = new Scanner(System.in);
            // Lee la opción seleccionada
            int opcion = sc.nextInt();
            // Limpia el buffer del scanner
            sc.nextLine();

            // Procesa la opción seleccionada
            switch (opcion) {
                case 1:
                    // Opción 1: Llena la cafetera a su capacidad máxima
                    cafetera.llenarCafetera();
                    System.out.println("Cafetera llena");
                    break;

                case 2:
                    // Opción 2: Sirve una cantidad específica de café
                    System.out.println("Ingrese la cantidad de café a servir: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine(); // Limpia el buffer
                    cafetera.servirTaza(cantidad);
                    System.out.println("Café servido");
                    // NOTA: Falta un break aquí, lo que puede causar que se ejecute el caso 3

                case 3:
                    // Opción 3: Vacía completamente la cafetera
                    cafetera.vaciarCafetera();
                    System.out.println("Cafetera vacía");
                    break;

                case 4:
                    // Opción 4: Agrega una cantidad específica de café
                    System.out.println("Ingrese la cantidad de café a agregar: ");
                    double cantidad2 = sc.nextDouble();
                    sc.nextLine(); // Limpia el buffer
                    cafetera.agregarCafe(cantidad2);
                    System.out.println("Café agregado");
                    break;

                default:
                    // Maneja opciones no válidas
                    System.out.println("Opción no válida");
                    break;
            }

            // Cierra el scanner (NOTA: Esto puede causar problemas en el bucle while)
            sc.close();
        }
    }
}