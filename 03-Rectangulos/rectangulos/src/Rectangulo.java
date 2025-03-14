// Importamos la clase Math para operaciones matemáticas
import java.lang.Math;

// Clase que representa un rectángulo en un plano cartesiano
public class Rectangulo {
    // Coordenada X del vértice superior izquierdo
    private int vertice1X;
    // Coordenada Y del vértice superior izquierdo
    private int vertice1Y;
    // Coordenada X del vértice inferior derecho
    private int vertice2X;
    // Coordenada Y del vértice inferior derecho
    private int vertice2Y;

    /**
     * Constructor que crea un rectángulo a partir de dos vértices opuestos
     * Organiza automáticamente los vértices para que vertice1 sea el superior izquierdo
     * y vertice2 sea el inferior derecho
     *
     * @param vertice1x Coordenada X del primer vértice
     * @param vertice1y Coordenada Y del primer vértice
     * @param vertice2x Coordenada X del segundo vértice
     * @param vertice2y Coordenada Y del segundo vértice
     */
    public Rectangulo(int vertice1x, int vertice1y, int vertice2x, int vertice2y) {
        // Asigna la menor coordenada X como el vértice izquierdo
        this.vertice1X = Math.min(vertice1x, vertice2x);
        // Asigna la menor coordenada Y como el vértice superior
        this.vertice1Y = Math.min(vertice1y, vertice2y);
        // Asigna la mayor coordenada X como el vértice derecho
        this.vertice2X = Math.max(vertice1x, vertice2x);
        // Asigna la mayor coordenada Y como el vértice inferior
        this.vertice2Y = Math.max(vertice1y, vertice2y);
    }

    /**
     * Calcula y devuelve el ancho del rectángulo
     * @return El ancho del rectángulo como valor absoluto entre las coordenadas X
     */
    public int getAncho() {
        // Retorna la diferencia absoluta entre las coordenadas X
        return Math.abs(vertice2X - vertice1X);
    }

    /**
     * Calcula y devuelve el alto del rectángulo
     * @return El alto del rectángulo como valor absoluto entre las coordenadas Y
     */
    public int getAlto() {
        // Retorna la diferencia absoluta entre las coordenadas Y
        return Math.abs(vertice2Y - vertice1Y);
    }

    /**
     * Calcula el área del rectángulo
     * @return El área del rectángulo como el producto de su ancho por su alto
     */
    public double calcularArea() {
        // Multiplica el ancho por el alto para obtener el área
        return getAncho() * getAlto();
    }

    /**
     * Obtiene la coordenada X del vértice superior izquierdo
     * @return Coordenada X del vértice superior izquierdo
     */
    public int getX() {
        return vertice1X;
    }

    /**
     * Obtiene la coordenada Y del vértice superior izquierdo
     * @return Coordenada Y del vértice superior izquierdo
     */
    public int getY() {
        return vertice1Y;
    }
}