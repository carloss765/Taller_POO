
// Clase que representa un número complejo con parte real e imaginaria
public class Complejo {
    // Almacena la parte real del número complejo
    private double real;
    // Almacena la parte imaginaria del número complejo
    private double imaginario;

    // Constructor que inicializa un número complejo con sus partes real e imaginaria
    public Complejo(double real, double imaginario) {
        // Asigna el valor real recibido al atributo real
        this.real = real;
        // Asigna el valor imaginario recibido al atributo imaginario
        this.imaginario = imaginario;
    }

    // Método getter que devuelve la parte real del número complejo
    public double getReal() {
        return real;
    }

    // Método getter que devuelve la parte imaginaria del número complejo
    public double getImaginario() {
        return imaginario;
    }

    // Método setter que establece un nuevo valor para la parte real
    public void setReal(double real) {
        this.real = real;
    }

    // Método setter que establece un nuevo valor para la parte imaginaria
    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    // Método que suma dos números complejos
    public Complejo suma(Complejo c) {
        // Retorna un nuevo número complejo con la suma de las partes reales e imaginarias
        return new Complejo(real + c.getReal(), imaginario + c.getImaginario());
    }

    // Método que resta dos números complejos
    public Complejo resta(Complejo c) {
        // Retorna un nuevo número complejo con la resta de las partes reales e imaginarias
        return new Complejo(real - c.getReal(), imaginario - c.getImaginario());
    }

    // Método que multiplica dos números complejos
    public Complejo multiplicacion(Complejo c) {
        // Retorna un nuevo número complejo aplicando la fórmula de multiplicación de complejos:
        // (a + bi)(c + di) = (ac - bd) + (ad + bc)i
        return new Complejo(real * c.getReal() - imaginario * c.getImaginario(),
                real * c.getImaginario() + imaginario * c.getReal());
    }

    // Método que divide dos números complejos
    public Complejo division(Complejo c) {
        // Calcula el denominador común (c² + d²)
        double denominador = c.getReal() * c.getReal() + c.getImaginario() * c.getImaginario();
        // Retorna un nuevo número complejo aplicando la fórmula de división de complejos:
        // (a + bi)/(c + di) = ((ac + bd)/(c² + d²)) + ((bc - ad)/(c² + d²))i
        return new Complejo((real * c.getReal() + imaginario * c.getImaginario()) / denominador,
                (imaginario * c.getReal() - real * c.getImaginario()) / denominador);
    }

    // Método que acumula (suma) otro número complejo al actual
    public void acumulacion(Complejo c) {
        // Suma la parte real del otro número complejo a la parte real actual
        this.real += c.getReal();
        // Suma la parte imaginaria del otro número complejo a la parte imaginaria actual
        this.imaginario += c.getImaginario();
    }

    // Método que convierte el número complejo a su representación en String
    public String toString() {
        // Retorna el número complejo en formato "a + bi"
        return real + " + " + imaginario + "i";
    }
}