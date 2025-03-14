import java.util.Random;

/**
 * Clase que implementa un array tridimensional de 2x3x4.
 * Proporciona funcionalidad para inicializar el array con valores aleatorios,
 * encontrar valores máximos y mínimos, y mostrar su contenido.
 */
public class Array234 {
    /** Array tridimensional de dimensiones 2x3x4 */
    private int[][][] array;

    /**
     * Constructor que inicializa el array con valores aleatorios.
     * Crea un array de 2x3x4 y lo llena con números aleatorios entre 0 y 99.
     */
    public Array234() {
        // Inicializar el array con las dimensiones especificadas
        array = new int[2][3][4];

        // Crear generador de números aleatorios
        Random random = new Random();

        // Llenar el array con valores aleatorios
        for (int i = 0; i < 2; i++) {           // Primera dimensión
            for (int j = 0; j < 3; j++) {       // Segunda dimensión
                for (int k = 0; k < 4; k++) {   // Tercera dimensión
                    array[i][j][k] = random.nextInt(100); // Valores entre 0 y 99
                }
            }
        }
    }

    /**
     * Encuentra y muestra los valores máximos y mínimos del array junto con sus índices.
     * Recorre todo el array para encontrar el valor más alto y más bajo,
     * guardando también las posiciones donde se encuentran.
     */
    public void max_min() {
        // Inicializar variables con el primer elemento del array
        int max = array[0][0][0];
        int min = array[0][0][0];
        int[] maxIndex = {0, 0, 0};  // Almacena índices del valor máximo
        int[] minIndex = {0, 0, 0};  // Almacena índices del valor mínimo

        // Recorrer el array completo buscando máximo y mínimo
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    // Actualizar máximo si se encuentra un valor mayor
                    if (array[i][j][k] > max) {
                        max = array[i][j][k];
                        maxIndex = new int[]{i, j, k};
                    }
                    // Actualizar mínimo si se encuentra un valor menor
                    if (array[i][j][k] < min) {
                        min = array[i][j][k];
                        minIndex = new int[]{i, j, k};
                    }
                }
            }
        }

        // Mostrar resultados con formato
        System.out.println("Valor máximo: " + max + " en el índice [" + maxIndex[0] + "][" + maxIndex[1] + "][" + maxIndex[2] + "]");
        System.out.println("Valor mínimo: " + min + " en el índice [" + minIndex[0] + "][" + minIndex[1] + "][" + minIndex[2] + "]");
    }

    /**
     * Muestra el contenido completo del array.
     * Imprime el array en un formato estructurado, separando las capas
     * con líneas en blanco para mejor visualización.
     */
    public void printArray() {
        for (int i = 0; i < 2; i++) {           // Recorrer primera dimensión
            for (int j = 0; j < 3; j++) {       // Recorrer segunda dimensión
                for (int k = 0; k < 4; k++) {   // Recorrer tercera dimensión
                    System.out.print(array[i][j][k] + " ");  // Imprimir valor con espacio
                }
                System.out.println();  // Nueva línea después de cada fila
            }
            System.out.println();  // Línea en blanco entre capas
        }
    }
}