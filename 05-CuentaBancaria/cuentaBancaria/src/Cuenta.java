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


    //? Metodos

    // Actualizar Saldo
    public void actualizarSaldo() {
        double interes = this.saldo * this.interesAnual / 365;
        this.saldo += interes;
    }

    // Ingresar Cantidad
    public void ingresarCantidad(double cantidad) {
        this.saldo += cantidad;
    }

    // Retirar Cantidad
    public void retirarCantidad(double cantidad) {
        this.saldo -= cantidad;
    }
}
