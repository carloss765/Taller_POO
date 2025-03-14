/**
 * Clase que representa el motor de un vehículo.
 * Gestiona el estado de encendido/apagado del motor y proporciona
 * métodos para controlar su funcionamiento.
 */
public class Motor {
    /** Estado del motor: true si está encendido, false si está apagado */
    private boolean encendido;

    /**
     * Constructor por defecto.
     * Inicializa el motor en estado apagado.
     */
    public Motor() {
        this.encendido = false;
    }

    /**
     * Arranca el motor.
     * Cambia el estado a encendido y muestra un mensaje de confirmación.
     */
    public void arrancar() {
        encendido = true;
        System.out.println("El motor está arrancado.");
    }

    /**
     * Apaga el motor.
     * Cambia el estado a apagado y muestra un mensaje de confirmación.
     */
    public void apagar() {
        encendido = false;
        System.out.println("El motor está apagado.");
    }

    /**
     * Verifica si el motor está encendido.
     * @return true si el motor está encendido, false si está apagado
     */
    public boolean isEncendido() {
        return encendido;
    }

    /**
     * Establece el estado del motor.
     * @param encendido true para encender el motor, false para apagarlo
     */
    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}