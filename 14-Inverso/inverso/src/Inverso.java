import java.util.Scanner;

public class Inverso {
    private int[] numeros;

    public Inverso() {
        numeros = new int[10];
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void pedirNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese diez números enteros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
    }

    public void mostrarNumerosInverso() {
        System.out.println("\nLos números en orden inverso son:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

}