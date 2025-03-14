/**
 * Clase que representa una ventana de un vehículo.
 * Gestiona el estado de la ventana (abierta/cerrada) y proporciona
 * métodos para controlar su apertura y cierre.
 */
public class Ventana {
    /** Estado de la ventana: true si está abierta, false si está cerrada */
    private boolean abierta;

    /**
     * Constructor por defecto.
     * Inicializa la ventana en estado cerrado.
     */
    public Ventana() {
        this.abierta = false;
    }

    /**
     * Abre la ventana.
     * Cambia el estado a abierta y muestra un mensaje de confirmación.
     */
    public void abrir() {
        abierta = true;
        System.out.println("La ventana está abierta.");
    }

    /**
     * Cierra la ventana.
     * Cambia el estado a cerrada y muestra un mensaje de confirmación.
     */
    public void cerrar() {
        abierta = false;
        System.out.println("La ventana está cerrada.");
    }

    /**
     * Verifica si la ventana está abierta.
     * @return true si la ventana está abierta, false si está cerrada
     */
    public boolean isAbierta() {
        return abierta;
    }

    /**
     * Establece el estado de la ventana.
     * @param abierta true para abrir la ventana, false para cerrarla
     */
    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
}