import java.util.Scanner;

public class Cafetera {

    private int capacidadMax;
    private double cantidadAc;

    // Constructor predeterminado
    public Cafetera(int capacidadMax, double cantidadAc) {
        this.capacidadMax = capacidadMax = 1000;
        this.cantidadAc = cantidadAc = 0;
    }

    // ? Constructor
    /*
     * inicializa la cantidad actual de
     * café igual a la capacidad máxima
     */
    public Cafetera(int capacidadMax) {
        this.capacidadMax = capacidadMax;
        this.cantidadAc = capacidadMax;
    }

    // ? Constructor
    /*
     * Si la cantidad actual es
     * mayor que la capacidad máxima de la cafetera, la ajustará al máximo.
     */
    public Cafetera(double cantidadAc) {
        this.capacidadMax = 1000;
        this.cantidadAc = cantidadAc;
        if (cantidadAc > capacidadMax) {
            this.cantidadAc = capacidadMax;
        }
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public double getCantidadAc() {
        return cantidadAc;
    }

    public void setCantidadAc(double cantidadAc) {
        this.cantidadAc = cantidadAc;
    }

    // ? Metodos

    // ? LlenarCafetera
    public void llenarCafetera() {
        this.cantidadAc = capacidadMax;
    }

    // ? ServirTaza
    public void servirTaza(double cantidad) {
        if (cantidadAc >= cantidad) {
            cantidadAc -= cantidad;
        } else {
            cantidadAc = 0;
        }

    }

    // ? VaciarCafetera
    public void vaciarCafetera() {
        cantidadAc = 0;
    }

    // ? AgregarCafe
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