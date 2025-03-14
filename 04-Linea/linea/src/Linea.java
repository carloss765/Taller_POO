// Clase que representa una línea en un plano cartesiano definida por dos puntos
public class Linea {
    // Atributos que definen los extremos de la línea
    // puntoA representa el primer extremo de la línea
    private Punto puntoA;
    // puntoB representa el segundo extremo de la línea
    private Punto puntoB;

    /**
     * Constructor por defecto
     * Crea una línea con ambos puntos en el origen (0,0)
     */
    public Linea() {
        this.puntoA = new Punto(0, 0);
        this.puntoB = new Punto(0, 0);
    }

    /**
     * Constructor que recibe dos puntos como parámetros
     * @param puntoA Primer punto de la línea
     * @param puntoB Segundo punto de la línea
     */
    public Linea(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    /**
     * Obtiene el primer punto de la línea
     * @return Punto A de la línea
     */
    public Punto getPuntoA() {
        return puntoA;
    }

    /**
     * Establece el primer punto de la línea
     * @param puntoA Nuevo punto A para la línea
     */
    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }

    /**
     * Obtiene el segundo punto de la línea
     * @return Punto B de la línea
     */
    public Punto getPuntoB() {
        return puntoB;
    }

    /**
     * Establece el segundo punto de la línea
     * @param puntoB Nuevo punto B para la línea
     */
    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }

    /**
     * Mueve la línea hacia la derecha
     * @param distancia Cantidad de unidades a mover en el eje X positivo
     */
    public void mueveDerecha(double distancia) {
        // Incrementa la coordenada X de ambos puntos
        puntoA.setX(puntoA.getX() + distancia);
        puntoB.setX(puntoB.getX() + distancia);
    }

    /**
     * Mueve la línea hacia la izquierda
     * @param distancia Cantidad de unidades a mover en el eje X negativo
     */
    public void mueveIzquierda(double distancia) {
        // Decrementa la coordenada X de ambos puntos
        puntoA.setX(puntoA.getX() - distancia);
        puntoB.setX(puntoB.getX() - distancia);
    }

    /**
     * Mueve la línea hacia arriba
     * @param distancia Cantidad de unidades a mover en el eje Y positivo
     */
    public void mueveArriba(double distancia) {
        // Incrementa la coordenada Y de ambos puntos
        puntoA.setY(puntoA.getY() + distancia);
        puntoB.setY(puntoB.getY() + distancia);
    }

    /**
     * Mueve la línea hacia abajo
     * @param distancia Cantidad de unidades a mover en el eje Y negativo
     */
    public void mueveAbajo(double distancia) {
        // Decrementa la coordenada Y de ambos puntos
        puntoA.setY(puntoA.getY() - distancia);
        puntoB.setY(puntoB.getY() - distancia);
    }

    /**
     * Sobrescribe el método toString para representar la línea como texto
     * @return Representación en texto de la línea con sus puntos
     */
    @Override
    public String toString() {
        // Retorna la línea en formato [puntoA,puntoB]
        return "[" + puntoA + "," + puntoB + "]";
    }
}