import java.util.Scanner;

/**
 * Clase que gestiona un array de números enteros y permite mostrarlos en orden inverso.
 * Proporciona funcionalidad para ingresar 10 números y mostrarlos en orden inverso al ingresado.
 */
public class Inverso {
    /** Array que almacena los 10 números enteros */
    private int[] numeros;

    /**
     * Constructor por defecto.
     * Inicializa el array con capacidad para 10 números enteros.
     */
    public Inverso() {
        numeros = new int[10];
    }

    /**
     * Obtiene el array de números.
     *
     * @return array con los números almacenados
     */
    public int[] getNumeros() {
        return numeros;
    }

    /**
     * Establece un nuevo array de números.
     *
     * @param numeros nuevo array de números a establecer
     */
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    /**
     * Solicita al usuario que ingrese 10 números enteros.
     * Los números se almacenan en el array en el orden en que son ingresados.
     */
    public void pedirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese diez números enteros:");
        // Bucle para solicitar los 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");  // Muestra el número de entrada actual
            numeros[i] = scanner.nextInt();                // Lee y almacena el número
        }
    }

    /**
     * Muestra los números almacenados en orden inverso.
     * Recorre el array desde el último elemento hasta el primero,
     * mostrando cada número en una línea separada.
     */
    public void mostrarNumerosInverso() {
        System.out.println("\nLos números en orden inverso son:");
        // Bucle que recorre el array desde el último elemento (índice 9) hasta el primero (índice 0)
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }
}