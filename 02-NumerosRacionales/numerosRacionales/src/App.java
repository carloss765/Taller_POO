import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        Racional racional1 = new Racional(0.0, 0.0);
        Racional racional2 = new Racional(0.0, 0.0);

        System.out.println("Ingrese el numerador del primer número racional: ");
        racional1.setNumerador(scanner.nextDouble());
        System.out.println("Ingrese el denominador del primer número racional: ");
        racional1.setDenominador(scanner.nextDouble());

        System.out.println("Ingrese el numerador del segundo número racional: ");
        racional2.setNumerador(scanner.nextDouble());
        System.out.println("Ingrese el denominador del segundo número racional: ");
        racional2.setDenominador(scanner.nextDouble());


        scanner.close();

        System.out.println("La suma de los números racionales es: " + racional1.sumar(racional2.getNumerador(), racional2.getDenominador()));
        System.out.println("La resta de los números racionales es: " + racional1.restar(racional2.getNumerador(), racional2.getDenominador()));
        System.out.println("La multiplicación de los números racionales es: " + racional1.multiplicar(racional2.getNumerador(), racional2.getDenominador()));
        System.out.println("La división de los números racionales es: " + racional1.dividir(racional2.getNumerador(), racional2.getDenominador()));
        System.out.println( "La comparación de los números racionales es: " + racional1.comparar(racional2));

    }
}