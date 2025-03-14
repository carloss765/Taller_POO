/**
 * Clase que representa una rueda de un vehículo.
 * Gestiona el estado de inflado de la rueda y proporciona métodos
 * para su mantenimiento como cambio de rueda y llanta.
 */
public class Rueda {
    /** Estado de la rueda: true si está inflada, false si está desinflada */
    private boolean inflada;

    /**
     * Constructor por defecto.
     * Inicializa la rueda en estado desinflado.
     */
    public Rueda() {
        this.inflada = false;
    }

    /**
     * Infla la rueda.
     * Cambia el estado a inflada y muestra un mensaje de confirmación.
     */
    public void inflar() {
        inflada = true;
        System.out.println("La rueda está inflada.");
    }

    /**
     * Desinfla la rueda.
     * Cambia el estado a desinflada y muestra un mensaje de confirmación.
     */
    public void desinflar() {
        inflada = false;
        System.out.println("La rueda está desinflada.");
    }

    /**
     * Cambia la rueda por una nueva.
     * La nueva rueda se coloca desinflada y muestra un mensaje de confirmación.
     */
    public void cambiar() {
        inflada = false;
        System.out.println("La rueda ha sido cambiada.");
    }

    /**
     * Cambia la llanta de la rueda.
     * El proceso requiere desinflar la rueda y muestra un mensaje de confirmación.
     */
    public void cambiarLlanta() {
        inflada = false;
        System.out.println("La llanta ha sido cambiada.");
    }

    /**
     * Verifica si la rueda está inflada.
     * @return true si la rueda está inflada, false si está desinflada
     */
    public boolean isInflada() {
        return inflada;
    }

    /**
     * Establece el estado de inflado de la rueda.
     * @param inflada true para inflar la rueda, false para desinflarla
     */
    public void setInflada(boolean inflada) {
        this.inflada = inflada;
    }
}