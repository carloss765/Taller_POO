/**
 * Clase principal que demuestra el uso de la clase Empleado.
 * Incluye ejemplos de creación, modificación y clonación de empleados,
 * así como la visualización de su información en diferentes formatos.
 */
public class App {
    /**
     * Método principal que ejecuta una serie de pruebas para demostrar
     * la funcionalidad de la clase Empleado.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // SECCIÓN 1: Creación y configuración del primer empleado
        // Usando el constructor predeterminado
        Empleado empleado1 = new Empleado();
        // Configuración de los datos personales y laborales
        empleado1.setNif("12345678A");
        empleado1.setSueldoBase(1500.0);          // Sueldo base mensual
        empleado1.setPagoPorHoraExtra(20.0);      // Tarifa por hora extra
        empleado1.setHorasExtraRealizadas(10);    // Horas extra del mes
        empleado1.setTipoIRPF(15.0);             // Porcentaje de IRPF
        empleado1.setCasado(true);               // Estado civil
        empleado1.setNumeroHijos(2);             // Número de hijos (afecta al IRPF)

        // Mostrar información básica del primer empleado
        System.out.println("Información básica del empleado 1:");
        empleado1.println();

        // Mostrar información completa del primer empleado
        System.out.println("\nToda la información del empleado 1:");
        empleado1.printAll();

        // SECCIÓN 2: Creación y configuración del segundo empleado
        // Usando el constructor parametrizado con NIF
        Empleado empleado2 = new Empleado("87654321B");
        // Configuración de los datos laborales
        empleado2.setSueldoBase(2000.0);          // Sueldo base más alto
        empleado2.setPagoPorHoraExtra(25.0);      // Tarifa por hora extra mayor
        empleado2.setHorasExtraRealizadas(5);     // Menos horas extra
        empleado2.setTipoIRPF(18.0);             // Mayor porcentaje de IRPF
        empleado2.setCasado(false);              // No casado
        empleado2.setNumeroHijos(0);             // Sin hijos

        // Mostrar información básica del segundo empleado
        System.out.println("\nInformación básica del empleado 2:");
        empleado2.println();

        // Mostrar información completa del segundo empleado
        System.out.println("\nToda la información del empleado 2:");
        empleado2.printAll();

        // SECCIÓN 3: Demostración de clonación de empleados
        // Crear una copia independiente del primer empleado
        Empleado empleado3 = empleado1.copia();
        // Mostrar que la copia contiene los mismos datos
        System.out.println("\nInformación del empleado clonado (empleado 3):");
        empleado3.printAll();
    }
}