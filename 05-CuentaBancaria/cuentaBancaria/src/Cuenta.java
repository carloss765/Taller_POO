import java.util.Scanner;

public class Cuenta {
    private int numCuenta;
    private int dNI;
    private double saldo;
    private double interesAnual;

    // Constructor
    public Cuenta(int numCuenta, int dNI, double saldo, double interesAnual) {
        this.numCuenta = numCuenta;
        this.dNI = dNI;
        this.saldo = saldo;
        this.interesAnual = interesAnual;
    }

    // Constructor por defecto
    public Cuenta() {
        this.numCuenta = 0;
        this.dNI = 0;
        this.saldo = 0;
        this.interesAnual = 0;
    }

    // Getters y Setters

    public int getNumCuenta() {
        return numCuenta;
    }

    public int getdNI() {
        return dNI;
    }

    public void setdNI(int dNI) {
        this.dNI = dNI;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }

    // ? Metodos

    // Actualizar Saldo
    public void actualizarSaldo() {
        double interes = this.saldo * this.interesAnual / 365;
        this.saldo += interes;

        System.out.println("--Actualizar Saldo--");
        System.out.println("Saldo Actualizado: " + this.saldo);
    }

    // Ingresar Cantidad
    public void ingresarCantidad(double cantidad) {
        this.saldo += cantidad;

        System.out.println("--Ingresar Cantidad--");
        System.out.println("Cantidad Ingresada: " + cantidad);
    }

    // Retirar Cantidad
    public void retirarCantidad(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;

            System.out.println("--Retirar Cantidad--");
            System.out.println("Cantidad Retirada: " + cantidad);
        }
    }

    // Mostrar Informacion
    public void mostrarInformacion() {
        System.out.println("--Informacion de la Cuenta--");
        System.out.println("Numero Cuenta: " + this.numCuenta);
        System.out.println("DNI: " + this.dNI);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Interes Anual: " + this.interesAnual);
    }

}