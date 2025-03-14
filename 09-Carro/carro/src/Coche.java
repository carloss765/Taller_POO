/**
 * Clase que representa un coche y sus componentes principales.
 * Gestiona la interacción entre el motor, las ruedas y las puertas del vehículo.
 */
public class Coche {
    // Componentes principales del coche
    private Motor motor;        // Motor del coche
    private Rueda[] ruedas;    // Array de 4 ruedas
    private Puerta[] puertas;  // Array de 2 puertas

    /**
     * Constructor por defecto.
     * Inicializa el coche con un motor nuevo, cuatro ruedas y dos puertas.
     */
    public Coche() {
        this.motor = new Motor();
        this.ruedas = new Rueda[]{ new Rueda(), new Rueda(), new Rueda(), new Rueda() };
        this.puertas = new Puerta[]{ new Puerta(), new Puerta() };
    }

    /**
     * Arranca el motor del coche.
     */
    public void arrancarMotor() {
        motor.arrancar();
    }

    /**
     * Apaga el motor del coche.
     */
    public void apagarMotor() {
        motor.apagar();
    }

    /**
     * Infla todas las ruedas del coche.
     */
    public void inflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.inflar();
        }
    }

    /**
     * Desinfla todas las ruedas del coche.
     */
    public void desinflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.desinflar();
        }
    }

    /**
     * Abre todas las puertas del coche.
     */
    public void abrirPuertas() {
        for (Puerta puerta : puertas) {
            puerta.abrirPuerta();
        }
    }

    /**
     * Cierra todas las puertas del coche.
     */
    public void cerrarPuertas() {
        for (Puerta puerta : puertas) {
            puerta.cerrarPuerta();
        }
    }

    /**
     * Abre todas las ventanas del coche.
     */
    public void abrirVentanas() {
        for (Puerta puerta : puertas) {
            puerta.abrirVentana();
        }
    }

    /**
     * Cierra todas las ventanas del coche.
     */
    public void cerrarVentanas() {
        for (Puerta puerta : puertas) {
            puerta.cerrarVentana();
        }
    }

    /**
     * Obtiene el motor del coche.
     * @return el motor del coche
     */
    public Motor getMotor() {
        return motor;
    }

    /**
     * Establece un nuevo motor para el coche.
     * @param motor el nuevo motor a establecer
     */
    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    /**
     * Obtiene el array de ruedas del coche.
     * @return array con las cuatro ruedas del coche
     */
    public Rueda[] getRuedas() {
        return ruedas;
    }

    /**
     * Establece un nuevo conjunto de ruedas para el coche.
     * @param ruedas array con las nuevas ruedas a establecer
     */
    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    /**
     * Obtiene el array de puertas del coche.
     * @return array con las dos puertas del coche
     */
    public Puerta[] getPuertas() {
        return puertas;
    }

    /**
     * Establece un nuevo conjunto de puertas para el coche.
     * @param puertas array con las nuevas puertas a establecer
     */
    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
}