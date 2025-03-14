// Importamos Scanner para leer entrada del usuario
import java.util.Scanner;

// Clase que simula una cafetera con capacidad máxima y cantidad actual de café
public class Cafetera {
    // Almacena la capacidad máxima de la cafetera en unidades
    private int capacidadMax;
    // Almacena la cantidad actual de café en la cafetera
    private double cantidadAc;

    // Constructor predeterminado que inicializa la cafetera con valores fijos
    // Establece capacidad máxima en 1000 y cantidad actual en 0
    public Cafetera(int capacidadMax, double cantidadAc) {
        this.capacidadMax = capacidadMax = 1000;
        this.cantidadAc = cantidadAc = 0;
    }

    // Constructor que recibe la capacidad máxima como parámetro
    // Inicializa la cafetera llena (cantidad actual igual a capacidad máxima)
    public Cafetera(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.cantidadAc = capacidadMax;
    }

    // Constructor que recibe la cantidad actual como parámetro
    // Si la cantidad excede la capacidad máxima (1000), la ajusta al máximo
    public Cafetera(double cantidadAc) {
        this.capacidadMax = 1000;
        this.cantidadAc = cantidadAc;
        if (cantidadAc > capacidadMax) {
            this.cantidadAc = capacidadMax;
        }
    }

    // Obtiene la capacidad máxima de la cafetera
    public int getCapacidadMax() {
        return capacidadMax;
    }

    // Establece una nueva capacidad máxima para la cafetera
    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    // Obtiene la cantidad actual de café en la cafetera
    public double getCantidadAc() {
        return cantidadAc;
    }

    // Establece una nueva cantidad actual de café
    public void setCantidadAc(double cantidadAc) {
        this.cantidadAc = cantidadAc;
    }

    // Métodos de operación de la cafetera

    // Llena la cafetera hasta su capacidad máxima
    public void llenarCafetera() {
        this.cantidadAc = capacidadMax;
    }

    // Sirve una cantidad específica de café
    // Si no hay suficiente café, sirve lo que queda y deja la cafetera vacía
    public void servirTaza(double cantidad) {
        if (cantidadAc >= cantidad) {
            cantidadAc -= cantidad;
        } else {
            cantidadAc = 0;
        }
    }

    // Vacía completamente la cafetera estableciendo la cantidad actual en 0
    public void vaciarCafetera() {
        cantidadAc = 0;
    }

    // Permite agregar más café a la cafetera
    // Solicita al usuario la cantidad a agregar
    // Si al agregar se supera la capacidad máxima, llena hasta el máximo
    public void agregarCafe(double cantidad) {
        System.out.println("Ingrese la cantidad de café a agregar: ");
        Scanner sc = new Scanner(System.in);
        cantidad = sc.nextDouble();
        if (cantidadAc + cantidad <= capacidadMax) {
            cantidadAc += cantidad;
        } else {
            cantidadAc = capacidadMax;
        }
        sc.close();
    }
}