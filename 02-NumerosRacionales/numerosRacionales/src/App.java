// Importamos la clase Scanner para leer entrada del usuario
import java.util.Scanner;

// Clase principal que contiene el punto de entrada del programa
public class App {
    // Método principal que inicia la ejecución del programa
    public static void main(String[] args) throws Exception {
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Inicializamos dos números racionales con valores 0.0/0.0
        Racional racional1 = new Racional(0.0, 0.0);
        Racional racional2 = new Racional(0.0, 0.0);

        // Solicitamos y leemos el numerador del primer número racional
        System.out.println("Ingrese el numerador del primer número racional: ");
        racional1.setNumerador(scanner.nextDouble());

        // Solicitamos y leemos el denominador del primer número racional
        System.out.println("Ingrese el denominador del primer número racional: ");
        racional1.setDenominador(scanner.nextDouble());

        // Solicitamos y leemos el numerador del segundo número racional
        System.out.println("Ingrese el numerador del segundo número racional: ");
        racional2.setNumerador(scanner.nextDouble());

        // Solicitamos y leemos el denominador del segundo número racional
        System.out.println("Ingrese el denominador del segundo número racional: ");
        racional2.setDenominador(scanner.nextDouble());

        // Cerramos el Scanner para liberar recursos
        scanner.close();

        // Realizamos y mostramos la suma de los números racionales
        System.out.println("La suma de los números racionales es: " +
            racional1.sumar(racional2.getNumerador(), racional2.getDenominador()));

        // Realizamos y mostramos la resta de los números racionales
        System.out.println("La resta de los números racionales es: " +
            racional1.restar(racional2.getNumerador(), racional2.getDenominador()));

        // Realizamos y mostramos la multiplicación de los números racionales
        System.out.println("La multiplicación de los números racionales es: " +
            racional1.multiplicar(racional2.getNumerador(), racional2.getDenominador()));

        // Realizamos y mostramos la división de los números racionales
        System.out.println("La división de los números racionales es: " +
            racional1.dividir(racional2.getNumerador(), racional2.getDenominador()));

        // Realizamos y mostramos la comparación entre los números racionales
        System.out.println("La comparación de los números racionales es: " +
            racional1.comparar(racional2));
    }
}