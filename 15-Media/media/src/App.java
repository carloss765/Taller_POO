import java.util.Arrays;

/**
 * Clase que demuestra cálculos estadísticos básicos.
 * Genera un array de números aleatorios y calcula su media
 * y desviación estándar.
 */
public class App {
    /**
     * Método principal que ejecuta los cálculos estadísticos.
     * Genera 30 números aleatorios, calcula y muestra su media
     * y desviación estándar.
     * 
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // Crear un array de 30 doubles para almacenar los números
        double[] numeros = new double[30];

        // Rellenar el array con números aleatorios entre 0 y 1
        // usando Math.random() que genera números en el rango [0,1)
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // Calcular la media aritmética del conjunto de números
        double media = calcularMedia(numeros);

        // Calcular la desviación estándar usando la media calculada
        double desviacionEstandar = calcularDesviacionEstandar(numeros, media);

        // Mostrar los resultados de los cálculos
        System.out.println("Array de números: " + Arrays.toString(numeros));
        System.out.println("Media: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }

    /**
     * Calcula la media aritmética de un array de números.
     * La media se calcula sumando todos los valores y dividiendo
     * por el número total de elementos.
     * 
     * @param array array de números para calcular la media
     * @return media aritmética de los números
     */
    public static double calcularMedia(double[] array) {
        double suma = 0;
        // Sumar todos los números del array
        for (double num : array) {
            suma += num;
        }
        // Dividir la suma por el número total de elementos
        return suma / array.length;
    }

    /**
     * Calcula la desviación estándar de un conjunto de números.
     * La desviación estándar es la raíz cuadrada de la varianza,
     * que se calcula como la media de los cuadrados de las diferencias
     * entre cada valor y la media.
     * 
     * @param array array de números para calcular la desviación estándar
     * @param media media aritmética del conjunto de números
     * @return desviación estándar de los números
     */
    public static double calcularDesviacionEstandar(double[] array, double media) {
        double sumaDiferenciasCuadradas = 0;
        // Calcular la suma de los cuadrados de las diferencias con la media
        for (double num : array) {
            sumaDiferenciasCuadradas += Math.pow(num - media, 2);
        }
        // Calcular la desviación estándar (raíz cuadrada de la varianza)
        // Se divide entre (n-1) para la corrección de Bessel
        return Math.sqrt(sumaDiferenciasCuadradas / (array.length - 1));
    }
}
