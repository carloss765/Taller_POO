// Importamos Scanner aunque no se utiliza en esta clase
import java.util.Scanner;

/**
 * Clase que representa una cuenta bancaria con sus operaciones básicas
 */
public class Cuenta {
    // Número identificador único de la cuenta
    private int numCuenta;
    // DNI del titular de la cuenta
    private int dNI;
    // Saldo actual de la cuenta
    private double saldo;
    // Tasa de interés anual de la cuenta (en decimal, ej: 0.1 = 10%)
    private double interesAnual;

    /**
     * Constructor que inicializa una cuenta con valores específicos
     * @param numCuenta Número de cuenta
     * @param dNI DNI del titular
     * @param saldo Saldo inicial
     * @param interesAnual Tasa de interés anual
     */
    public Cuenta(int numCuenta, int dNI, double saldo, double interesAnual) {
        this.numCuenta = numCuenta;
        this.dNI = dNI;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    /**
     * Constructor por defecto que inicializa una cuenta con valores en cero
     */
    public Cuenta() {
        this.numCuenta = 0;
        this.dNI = 0;
        this.saldo = 0;
        this.interesAnual = 0;
    }

    // Métodos de acceso (Getters y Setters)

    /**
     * Obtiene el número de cuenta
     * @return Número de cuenta
     */
    public int getNumCuenta() {
        return numCuenta;
    }

    /**
     * Obtiene el DNI del titular
     * @return DNI del titular
     */
    public int getdNI() {
        return dNI;
    }

    /**
     * Establece el DNI del titular
     * @param dNI Nuevo DNI
     */
    public void setdNI(int dNI) {
        this.dNI = dNI;
    }

    /**
     * Obtiene el saldo actual
     * @return Saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Establece un nuevo saldo
     * @param saldo Nuevo saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene la tasa de interés anual
     * @return Tasa de interés anual
     */
    public double getInteresAnual() {
        return interesAnual;
    }

    /**
     * Establece una nueva tasa de interés anual
     * @param interesAnual Nueva tasa de interés
     */
    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    // Métodos de operaciones bancarias

    /**
     * Actualiza el saldo aplicando el interés diario
     * (interés anual dividido entre 365 días)
     */
    public void actualizarSaldo() {
        // Calcula el interés diario y lo suma al saldo
        double interes = this.saldo * this.interesAnual / 365;
        this.saldo += interes;

        // Muestra el resultado de la operación
        System.out.println("--Actualizar Saldo--");
        System.out.println("Saldo Actualizado: " + this.saldo);
    }

    /**
     * Ingresa una cantidad de dinero en la cuenta
     * @param cantidad Monto a ingresar
     */
    public void ingresarCantidad(double cantidad) {
        // Suma la cantidad al saldo actual
        this.saldo += cantidad;

        // Muestra el resultado de la operación
        System.out.println("--Ingresar Cantidad--");
        System.out.println("Cantidad Ingresada: " + cantidad);
    }

    /**
     * Retira una cantidad de dinero si hay saldo suficiente
     * @param cantidad Monto a retirar
     */
    public void retirarCantidad(double cantidad) {
        // Verifica si hay saldo suficiente
        if (this.saldo >= cantidad) {
            // Resta la cantidad del saldo
            this.saldo -= cantidad;

            // Muestra el resultado de la operación
            System.out.println("--Retirar Cantidad--");
            System.out.println("Cantidad Retirada: " + cantidad);
        }
    }

    /**
     * Muestra toda la información de la cuenta
     */
    public void mostrarInformacion() {
        // Imprime los detalles de la cuenta
        System.out.println("--Informacion de la Cuenta--");
        System.out.println("Numero Cuenta: " + this.numCuenta);
        System.out.println("DNI: " + this.dNI);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Interes Anual: " + this.interesAnual);
    }
}