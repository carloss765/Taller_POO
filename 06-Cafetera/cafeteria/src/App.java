import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("---- Cafetera ----");

            Cafetera cafetera = new Cafetera(1000);

            System.out.println("Qué desea hacer?");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Café");

            Scanner sc = new Scanner(System.in);
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    cafetera.llenarCafetera();
                    System.out.println("Cafetera llena");

                    break;

                case 2:
                    System.out.println("Ingrese la cantidad de café a servir: ");
                    double cantidad = sc.nextDouble();
                    sc.nextLine();
                    cafetera.servirTaza(cantidad);
                    System.out.println("Café servido");

                case 3:
                    cafetera.vaciarCafetera();
                    System.out.println("Cafetera vacía");

                    break;

                case 4:
                    System.out.println("Ingrese la cantidad de café a agregar: ");
                    double cantidad2 = sc.nextDouble();
                    sc.nextLine();
                    cafetera.agregarCafe(cantidad2);
                    System.out.println("Café agregado");

                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
            sc.close();
        }
    }

}
