import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Complejo c1 = new Complejo(0, 0);
        Complejo c2 = new Complejo(0, 0);

        System.out.println("Introduce la parte real del primer número complejo:");
        c1.setReal(sc.nextDouble());

        System.out.println("Introduce la parte imaginaria del primer número complejo:");
        c1.setImaginario(sc.nextDouble());

        System.out.println("Introduce la parte real del segundo número complejo:");
        c2.setReal(sc.nextDouble());

        System.out.println("Introduce la parte imaginaria del segundo número complejo:");
        c2.setImaginario(sc.nextDouble());

        sc.close();

        System.out.println("Resultados de las operaciones:");
        System.out.println("Suma: " + c1.suma(c1));
        System.out.println("Resta: " + c1.resta(c2));
        System.out.println("Multiplicación: " + c1.multiplicacion(c1));
        System.out.println("División: " + c1.division(c2));
            c1.acumulacion(c2);
        System.out.println("Acumulador: " + c1);

    }
}
