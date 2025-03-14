// Clase que representa un número racional (fracción) con numerador y denominador
public class Racional {
    // Atributo que almacena el numerador del número racional
    private double numerador;
    // Atributo que almacena el denominador del número racional
    private double denominador;

    /**
     * Constructor de la clase Racional
     * @param numerador Valor inicial del numerador
     * @param denominador Valor inicial del denominador
     */
    public Racional(double numerador, double denominador) {
        // Inicializa el numerador con el valor recibido
        this.numerador = numerador;
        // Inicializa el denominador con el valor recibido
        this.denominador = denominador;
    }

    /**
     * Método getter para obtener el numerador
     * @return El valor del numerador
     */
    public double getNumerador() {
        return numerador;
    }

    /**
     * Método setter para establecer el numerador
     * @param numerador Nuevo valor para el numerador
     */
    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    /**
     * Método getter para obtener el denominador
     * @return El valor del denominador
     */
    public double getDenominador() {
        return denominador;
    }

    /**
     * Método setter para establecer el denominador
     * @param denominador Nuevo valor para el denominador
     */
    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    /**
     * Método que suma dos números racionales
     * @param numerador Numerador del segundo número racional
     * @param denominador Denominador del segundo número racional
     * @return Resultado de la suma
     */
    public double sumar(double numerador, double denominador) {
        // Retorna la suma de los números
        return numerador + denominador;
    }

    /**
     * Método que resta dos números racionales
     * @param numerador Numerador del segundo número racional
     * @param denominador Denominador del segundo número racional
     * @return Resultado de la resta
     */
    public double restar(double numerador, double denominador) {
        // Retorna la resta de los números
        return numerador - denominador;
    }

    /**
     * Método que multiplica dos números racionales
     * @param numerador Numerador del segundo número racional
     * @param denominador Denominador del segundo número racional
     * @return Resultado de la multiplicación
     */
    public double multiplicar(double numerador, double denominador) {
        // Retorna el producto de los números
        return numerador * denominador;
    }

    /**
     * Método que divide dos números racionales
     * @param numerador Numerador del segundo número racional
     * @param denominador Denominador del segundo número racional
     * @return Resultado de la división
     */
    public double dividir(double numerador, double denominador) {
        // Retorna el cociente de los números
        return numerador / denominador;
    }

    /**
     * Método que compara dos números racionales
     * @param otro Objeto Racional a comparar con el actual
     * @return -1 si es menor, 0 si es igual, 1 si es mayor
     */
    public int comparar(Racional otro) {
        // Compara los valores racionales convertidos a decimal
        // Utiliza Double.compare para manejar casos especiales como infinito y NaN
        return Double.compare(this.numerador / this.denominador,
                            otro.numerador / otro.denominador);
    }
}