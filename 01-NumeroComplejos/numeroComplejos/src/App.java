// Importamos la clase Scanner para poder leer entrada del usuario desde la consola
import java.util.Scanner;

/**
 * Clase principal que contiene el punto de entrada del programa para operaciones con números complejos
 */
public class App {
    /**
     * Método principal que inicia la ejecución del programa
     * @param args Argumentos de línea de comandos (no utilizados en este programa)
     * @throws Exception Posibles excepciones durante la ejecución
     */
    public static void main(String[] args) throws Exception {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Inicializamos dos números complejos con valores 0 + 0i
        Complejo c1 = new Complejo(0, 0);
        Complejo c2 = new Complejo(0, 0);

        // Solicitamos y leemos la parte real del primer número complejo
        System.out.println("Introduce la parte real del primer número complejo:");
        c1.setReal(sc.nextDouble());

        // Solicitamos y leemos la parte imaginaria del primer número complejo
        System.out.println("Introduce la parte imaginaria del primer número complejo:");
        c1.setImaginario(sc.nextDouble());

        // Solicitamos y leemos la parte real del segundo número complejo
        System.out.println("Introduce la parte real del segundo número complejo:");
        c2.setReal(sc.nextDouble());

        // Solicitamos y leemos la parte imaginaria del segundo número complejo
        System.out.println("Introduce la parte imaginaria del segundo número complejo:");
        c2.setImaginario(sc.nextDouble());

        // Cerramos el Scanner para liberar recursos
        sc.close();

        // Mostramos el encabezado de los resultados
        System.out.println("Resultados de las operaciones:");

        // Realizamos y mostramos la suma de los números complejos
        System.out.println("Suma: " + c1.suma(c1));

        // Realizamos y mostramos la resta de los números complejos
        System.out.println("Resta: " + c1.resta(c2));

        // Realizamos y mostramos la multiplicación de los números complejos
        System.out.println("Multiplicación: " + c1.multiplicacion(c1));

        // Realizamos y mostramos la división de los números complejos
        System.out.println("División: " + c1.division(c2));

        // Acumulamos el segundo número complejo en el primero
        c1.acumulacion(c2);

        // Mostramos el resultado de la acumulación
        System.out.println("Acumulador: " + c1);
    }
}
