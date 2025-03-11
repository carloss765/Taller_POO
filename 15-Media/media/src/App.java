import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        // Crear un array de 30 doubles
        double[] numeros = new double[30];

        // Rellenar el array con números aleatorios entre 0 y 1
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Math.random();
        }

        // Calcular la media
        double media = calcularMedia(numeros);

        // Calcular la desviación estándar
        double desviacionEstandar = calcularDesviacionEstandar(numeros, media);

        // Mostrar resultados
        System.out.println("Array de números: " + Arrays.toString(numeros));
        System.out.println("Media: " + media);
        System.out.println("Desviación estándar: " + desviacionEstandar);
    }

    // Método para calcular la media
    public static double calcularMedia(double[] array) {
        double suma = 0;
        for (double num : array) {
            suma += num;
        }
        return suma / array.length;
    }

    // Método para calcular la desviación estándar
    public static double calcularDesviacionEstandar(double[] array, double media) {
        double sumaDiferenciasCuadradas = 0;
        for (double num : array) {
            sumaDiferenciasCuadradas += Math.pow(num - media, 2);
        }
        return Math.sqrt(sumaDiferenciasCuadradas / (array.length - 1));
    }
}