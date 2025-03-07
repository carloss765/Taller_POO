import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cuenta cuenta1 = new Cuenta(1, 12345678, 1000, 0.1);

        while (true) {

            System.out.println("---Bienvenido a su cuenta bancaria---");
            System.out.println("1. Actualizar Saldo");
            System.out.println("2. Ingresar Dinero");
            System.out.println("3. Retirar Dinero");
            System.out.println("4. Consultar Cuenta");

            Scanner sc = new Scanner(System.in);

            String opcionseleccionada = sc.nextLine();

            switch (opcionseleccionada) {
                case "1":
                    cuenta1.actualizarSaldo();

                    break;

                case "2":
                    System.out.println("Ingrese la cantidad a ingresar: ");
                    double cantidadIngresar = sc.nextDouble();
                    cuenta1.ingresarCantidad(cantidadIngresar);

                    break;

                case "3":
                    System.out.println("Ingrese la cantidad a retirar: ");
                    double cantidadRetirar = sc.nextDouble();
                    cuenta1.retirarCantidad(cantidadRetirar);

                    break;

                case "4":
                    cuenta1.mostrarInformacion();

                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
