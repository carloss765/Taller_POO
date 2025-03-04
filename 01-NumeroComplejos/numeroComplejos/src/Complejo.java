public class Complejo {
    private double real;
    private double imaginario;

    public Complejo(double real, double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public Complejo suma(Complejo c) {
        return new Complejo(real + c.getReal(), imaginario + c.getImaginario());
    }

    public Complejo resta(Complejo c) {
        return new Complejo(real - c.getReal(), imaginario - c.getImaginario());
    }

    public Complejo multiplicacion(Complejo c) {
        return new Complejo(real * c.getReal() - imaginario * c.getImaginario(),
                real * c.getImaginario() + imaginario * c.getReal());
    }

    public Complejo division(Complejo c) {
        double denominador = c.getReal() * c.getReal() + c.getImaginario() * c.getImaginario();
        return new Complejo((real * c.getReal() + imaginario * c.getImaginario()) / denominador,
                (imaginario * c.getReal() - real * c.getImaginario()) / denominador);
    }

    public void acumulacion(Complejo c) {
        this.real += c.getReal();
        this.imaginario += c.getImaginario();
    }

    public String toString() {
        return real + " + " + imaginario + "i";
    }
}