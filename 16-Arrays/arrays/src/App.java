/**
 * Clase principal que demuestra el uso de la clase Array234.
 * Crea y manipula un array tridimensional, mostrando su contenido
 * y encontrando sus valores máximos y mínimos.
 *
 * @author Brahian
 */
public class App {
    /**
     * Método principal que ejecuta la demostración de Array234.
     * Crea una instancia de Array234, muestra su contenido y
     * encuentra los valores máximos y mínimos con sus posiciones.
     *
     * @param args argumentos de línea de comando (no utilizados)
     * @throws Exception si ocurre algún error durante la ejecución
     */
    public static void main(String[] args) throws Exception {
        // Crear una nueva instancia de Array234 (inicializa array 2x3x4 con valores aleatorios)
        Array234 array234 = new Array234();

        // Mostrar el contenido actual del array tridimensional
        System.out.println("Contenido del array tridimensional:");
        array234.printArray();

        // Encontrar y mostrar los valores máximos y mínimos con sus índices
        System.out.println("\nValores máximos y mínimos del array:");
        array234.max_min();
    }
}