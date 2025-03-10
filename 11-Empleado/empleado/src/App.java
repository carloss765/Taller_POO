public class App {
    public static void main(String[] args) {
        // Crear una instancia de Empleado usando el constructor predeterminado
        Empleado empleado1 = new Empleado();
        empleado1.setNif("12345678A");
        empleado1.setSueldoBase(1500.0);
        empleado1.setPagoPorHoraExtra(20.0);
        empleado1.setHorasExtraRealizadas(10);
        empleado1.setTipoIRPF(15.0);
        empleado1.setCasado(true);
        empleado1.setNumeroHijos(2);

        // Imprimir la información básica del empleado
        System.out.println("Información básica del empleado 1:");
        empleado1.println();

        // Imprimir toda la información del empleado
        System.out.println("\nToda la información del empleado 1:");
        empleado1.printAll();

        // Crear una instancia de Empleado usando el constructor parametrizado
        Empleado empleado2 = new Empleado("87654321B");
        empleado2.setSueldoBase(2000.0);
        empleado2.setPagoPorHoraExtra(25.0);
        empleado2.setHorasExtraRealizadas(5);
        empleado2.setTipoIRPF(18.0);
        empleado2.setCasado(false);
        empleado2.setNumeroHijos(0);

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
    }
}