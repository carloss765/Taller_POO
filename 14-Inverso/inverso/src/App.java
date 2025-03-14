/**
 * Clase principal que demuestra el uso de la clase Inverso.
 * Permite ingresar una serie de números y mostrarlos en orden inverso.
 *
 * @author Brahian
 */
public class App {
    /**
     * Método principal que ejecuta la demostración de la clase Inverso.
     * Crea una instancia de Inverso, solicita números al usuario y
     * los muestra en orden inverso.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // Crear una nueva instancia de la clase Inverso
        Inverso inverso = new Inverso();

        // Solicitar al usuario que ingrese los números
        inverso.pedirNumeros();

        // Mostrar los números en orden inverso
        inverso.mostrarNumerosInverso();
    }
}