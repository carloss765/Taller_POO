import java.lang.Math;

public class Rectangulo {
    private int vertice1X;
    private int vertice1Y;
    private int vertice2X;
    private int vertice2Y;

    // Constructor
    public Rectangulo(int vertice1x, int vertice1y, int vertice2x, int vertice2y) {
        this.vertice1X = Math.min(vertice1x, vertice2x);
        this.vertice1Y = Math.min(vertice1y, vertice2y);
        this.vertice2X = Math.max(vertice1x, vertice2x);
        this.vertice2Y = Math.max(vertice1y, vertice2y);
    }

    // Getters and Setters
    public int getAncho() {
        return Math.abs(vertice2X - vertice1X);
    }

    public int getAlto() {
        return Math.abs(vertice2Y - vertice1Y);
    }

    // Método para calcular el área
    public double calcularArea() {
        return getAncho() * getAlto();
    }

    // Métodos para obtener coordenadas
    public int getX() {
        return vertice1X;
    }

    public int getY() {
        return vertice1Y;
    }
}