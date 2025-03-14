/**
 * Clase que representa un punto en un plano cartesiano con coordenadas (x,y)
 */
public class Punto {
    // Coordenada x del punto en el plano cartesiano
    private double x;
    // Coordenada y del punto en el plano cartesiano
    private double y;

    /**
     * Constructor que crea un punto con coordenadas específicas
     * @param x Coordenada x del punto
     * @param y Coordenada y del punto
     */
    public Punto(double x, double y) {
        // Inicializa la coordenada x del punto
        this.x = x;
        // Inicializa la coordenada y del punto
        this.y = y;
    }

    /**
     * Obtiene la coordenada x del punto
     * @return Valor de la coordenada x
     */
    public double getX() {
        return x;
    }

    /**
     * Establece un nuevo valor para la coordenada x
     * @param x Nuevo valor para la coordenada x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * Obtiene la coordenada y del punto
     * @return Valor de la coordenada y
     */
    public double getY() {
        return y;
    }

    /**
     * Establece un nuevo valor para la coordenada y
     * @param y Nuevo valor para la coordenada y
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * Sobrescribe el método toString para representar el punto como texto
     * @return Representación en texto del punto en formato (x,y)
     */
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}