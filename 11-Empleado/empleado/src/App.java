import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia de Empleado usando el constructor predeterminado
        Empleado empleado1 = new Empleado();
        System.out.print("Ingrese el NIF del empleado 1: ");
        empleado1.setNif(scanner.nextLine());
        System.out.print("Ingrese el sueldo base del empleado 1: ");
        empleado1.setSueldoBase(scanner.nextDouble());
        System.out.print("Ingrese el pago por hora extra del empleado 1: ");
        empleado1.setPagoPorHoraExtra(scanner.nextDouble());
        System.out.print("Ingrese las horas extra realizadas del empleado 1: ");
        empleado1.setHorasExtraRealizadas(scanner.nextInt());
        System.out.print("Ingrese el tipo de IRPF del empleado 1: ");
        empleado1.setTipoIRPF(scanner.nextDouble());
        System.out.print("¿Está casado el empleado 1? (true/false): ");
        empleado1.setCasado(scanner.nextBoolean());
        System.out.print("Ingrese el número de hijos del empleado 1: ");
        empleado1.setNumeroHijos(scanner.nextInt());
        scanner.nextLine(); // Consumir el salto de línea

        // Imprimir la información básica del empleado
        System.out.println("\nInformación básica del empleado 1:");
        empleado1.println();

        // Imprimir toda la información del empleado
        System.out.println("\nToda la información del empleado 1:");
        empleado1.printAll();

        // Crear una instancia de Empleado usando el constructor parametrizado
        System.out.print("\nIngrese el NIF del empleado 2: ");
        Empleado empleado2 = new Empleado(scanner.nextLine());
        System.out.print("Ingrese el sueldo base del empleado 2: ");
        empleado2.setSueldoBase(scanner.nextDouble());
        System.out.print("Ingrese el pago por hora extra del empleado 2: ");
        empleado2.setPagoPorHoraExtra(scanner.nextDouble());
        System.out.print("Ingrese las horas extra realizadas del empleado 2: ");
        empleado2.setHorasExtraRealizadas(scanner.nextInt());
        System.out.print("Ingrese el tipo de IRPF del empleado 2: ");
        empleado2.setTipoIRPF(scanner.nextDouble());
        System.out.print("¿Está casado el empleado 2? (true/false): ");
        empleado2.setCasado(scanner.nextBoolean());
        System.out.print("Ingrese el número de hijos del empleado 2: ");
        empleado2.setNumeroHijos(scanner.nextInt());
        scanner.nextLine(); // Consumir el salto de línea

        // Imprimir la información básica del empleado
        System.out.println("\nInformación básica del empleado 2:");
        empleado2.println();

        // Imprimir toda la información del empleado
        System.out.println("\nToda la información del empleado 2:");
        empleado2.printAll();

        // Clonar un empleado
        Empleado empleado3 = empleado1.copia();
        System.out.println("\nInformación del empleado clonado (empleado 3):");
        empleado3.printAll();

        scanner.close();
    }
}