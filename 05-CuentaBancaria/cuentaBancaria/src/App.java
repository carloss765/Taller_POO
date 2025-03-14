// Importamos Scanner para leer entrada del usuario
import java.util.Scanner;

/**
 * Clase principal que implementa un menú interactivo para operaciones bancarias
 */
public class App {
    /**
     * Método principal que ejecuta el programa de cuenta bancaria
     * @param args Argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) throws Exception {
        // Creamos una nueva cuenta con:
        // - Número de cuenta: 1
        // - DNI: 12345678
        // - Saldo inicial: 1000
        // - Interés anual: 0.1 (10%)
        Cuenta cuenta1 = new Cuenta(1, 12345678, 1000, 0.1);

        // Bucle principal del programa que se ejecuta indefinidamente
        while (true) {
            // Mostramos el menú de opciones
            System.out.println("---Bienvenido a su cuenta bancaria---");
            System.out.println("1. Actualizar Saldo");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Consultar Cuenta");

            // Creamos un Scanner para leer la entrada del usuario
            Scanner sc = new Scanner(System.in);

            // Leemos la opción seleccionada por el usuario
            String opcionseleccionada = sc.nextLine();

            // Evaluamos la opción seleccionada
            switch (opcionseleccionada) {
                case "1":
                    // Opción 1: Actualizar el saldo con el interés
                    cuenta1.actualizarSaldo();
                    break;

                case "2":
                    // Opción 2: Ingresar dinero en la cuenta
                    System.out.println("Ingrese la cantidad a ingresar: ");
                    double cantidadIngresar = sc.nextDouble();
                    cuenta1.ingresarCantidad(cantidadIngresar);
                    break;

                case "3":
                    // Opción 3: Retirar dinero de la cuenta
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = sc.nextDouble();
                    cuenta1.retirarCantidad(cantidadRetirar);
                    break;

                case "4":
                    // Opción 4: Mostrar información de la cuenta
                    cuenta1.mostrarInformacion();
                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}