public class Linea {
    // Atributos
    private Punto puntoA;
    private Punto puntoB;
// Constructores
    public Linea() {
        this.puntoA = new Punto(0, 0);
        this.puntoB = new Punto(0, 0);
    }
// Constructor con parámetros
    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
// Getters y Setters
    public Punto getPuntoA() {
        return puntoA;
    }

    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    public Punto getPuntoB() {
        return puntoB;
    }

    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }
// Métodos
    // Mover la línea
    public void mueveDerecha(double distancia) {
        puntoA.setX(puntoA.getX() + distancia);
        puntoB.setX(puntoB.getX() + distancia);
    }
// Mover la línea
    public void mueveIzquierda(double distancia) {
        puntoA.setX(puntoA.getX() - distancia);
        puntoB.setX(puntoB.getX() - distancia);
    }

    public void mueveArriba(double distancia) {
        puntoA.setY(puntoA.getY() + distancia);
        puntoB.setY(puntoB.getY() + distancia);
    }

    public void mueveAbajo(double distancia) {
        puntoA.setY(puntoA.getY() - distancia);
        puntoB.setY(puntoB.getY() - distancia);
    }

    @Override
    public String toString() {
        return "[" + puntoA + "," + puntoB + "]";
    }
}
