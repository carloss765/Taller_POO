/**
 * Clase que representa una puerta de un vehículo.
 * Gestiona el estado de la puerta (abierta/cerrada) y contiene una ventana
 * que puede ser controlada de manera independiente.
 */
public class Puerta {
    private Ventana ventana;  // Ventana asociada a la puerta
    private boolean abierta;  // Estado de la puerta: true si está abierta, false si está cerrada

    /**
     * Constructor por defecto.
     * Inicializa la puerta en estado cerrado y crea una nueva ventana asociada.
     */
    public Puerta() {
        this.ventana = new Ventana();
        this.abierta = false;
    }

    /**
     * Abre la puerta.
     * Cambia el estado a abierto y muestra un mensaje de confirmación.
     */
    public void abrirPuerta() {
        abierta = true;
        System.out.println("La puerta está abierta.");
    }

    /**
     * Cierra la puerta.
     * Cambia el estado a cerrado y muestra un mensaje de confirmación.
     */
    public void cerrarPuerta() {
        abierta = false;
        System.out.println("La puerta está cerrada.");
    }

    /**
     * Abre la ventana asociada a la puerta.
     * Delega la operación al objeto ventana.
     */
    public void abrirVentana() {
        ventana.abrir();
    }

    /**
     * Cierra la ventana asociada a la puerta.
     * Delega la operación al objeto ventana.
     */
    public void cerrarVentana() {
        ventana.cerrar();
    }

    /**
     * Verifica si la puerta está abierta.
     * @return true si la puerta está abierta, false si está cerrada
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Establece el estado de la puerta.
     * @param abierta true para abrir la puerta, false para cerrarla
     */
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    /**
     * Obtiene la ventana asociada a la puerta.
     * @return la ventana de la puerta
     */
    public Ventana getVentana() {
        return ventana;
    }

    /**
     * Establece una nueva ventana para la puerta.
     * @param ventana la nueva ventana a asociar con la puerta
     */
    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
}