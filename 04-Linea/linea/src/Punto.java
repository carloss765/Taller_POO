public class Punto {
    private double x;
    private double y;
 // Constructor
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }
// Getters y Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
// Métodos
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}