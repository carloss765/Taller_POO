public class Racional {
    private double numerador;
    private double denominador;

    public Racional(double numerador, double denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double sumar(double numerador, double denominador) {
        return numerador + denominador;
    }

    public double restar(double numerador, double denominador) {
        return numerador - denominador;
    }

    public double multiplicar(double numerador, double denominador) {
        return numerador * denominador;
    }

    public double dividir(double numerador, double denominador) {
        return numerador / denominador;
    }

    /**
     * Compara este objeto Racional con otro objeto Racional.
     * @param otro El objeto Racional a comparar.
     * @return Un valor negativo si este objeto es menor que el otro,
     *         cero si son iguales, o un valor positivo si este objeto es mayor que el otro.
     */
    public int comparar(Racional otro) {
        return Double.compare(this.numerador / this.denominador, otro.numerador / otro.denominador);
    }
}