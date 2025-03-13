import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fecha fecha = new Fecha(1, 1, 1900); // Fecha inicial por defecto

        int opcion;
        do {
            System.out.println("\n--- Menú de opciones ---");
            System.out.println("1. Mostrar fecha actual");
            System.out.println("2. Mostrar día de la semana");
            System.out.println("3. Mostrar fecha en formato largo");
            System.out.println("4. Avanzar fecha un número de días");
            System.out.println("5. Retroceder fecha un número de días");
            System.out.println("6. Calcular días entre dos fechas");
            System.out.println("7. Avanzar al día siguiente");
            System.out.println("8. Retroceder al día anterior");
            System.out.println("9. Crear una copia de la fecha");
            System.out.println("10. Comparar fechas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Fecha actual: " + fecha);
                    break;

                case 2:
                    System.out.println("Día de la semana: " + fecha.diaSemana());
                    break;

                case 3:
                    System.out.println("Fecha en formato largo: " + fecha.larga());
                    break;

                case 4:
                    System.out.print("Ingrese el número de días a avanzar: ");
                    long diasAvanzar = scanner.nextLong();
                    fecha.fechaTras(diasAvanzar);
                    System.out.println("Nueva fecha: " + fecha);
                    break;

                case 5:
                    System.out.print("Ingrese el número de días a retroceder: ");
                    long diasRetroceder = scanner.nextLong();
                    fecha.fechaTras(-diasRetroceder); // Se usa negativo para retroceder
                    System.out.println("Nueva fecha: " + fecha);
                    break;

                case 6:
                    System.out.println("Ingrese otra fecha para calcular la diferencia:");
                    Fecha otraFecha = new Fecha(1, 1, 1900);
                    otraFecha.leer();
                    System.out.println("Días entre las fechas: " + fecha.diasEntre(otraFecha));
                    break;

                case 7:
                    fecha.fechaTras(1);
                    System.out.println("Fecha al día siguiente: " + fecha);
                    break;

                case 8:
                    fecha.fechaTras(-1);
                    System.out.println("Fecha al día anterior: " + fecha);
                    break;

                case 9:
                    Fecha copiaFecha = fecha.copia();
                    System.out.println("Copia de la fecha creada: " + copiaFecha);
                    break;

                case 10:
                    System.out.println("Ingrese otra fecha para comparar:");
                    Fecha fechaComparar = new Fecha(1, 1, 1900);
                    fechaComparar.leer();
                    System.out.println("¿Las fechas son iguales? " + fecha.igualQue(fechaComparar));
                    System.out.println("¿La fecha actual es menor que la ingresada? " + fecha.menorQue(fechaComparar));
                    System.out.println("¿La fecha actual es mayor que la ingresada? " + fecha.mayorQue(fechaComparar));
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 0);

        scanner.close();
    }
}
