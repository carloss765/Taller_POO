/**
 * Clase que representa una persona con nombre y apellido.
 * Proporciona funcionalidad para gestionar y mostrar información personal básica.
 */
public class Persona {
    /** Nombre de la persona */
    private String nombre;

    /** Apellido de la persona */
    private String apellido;

    /**
     * Constructor que crea una persona con nombre y apellido.
     *
     * @param nombre nombre de la persona
     * @param apellido apellido de la persona
     */
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre nuevo nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido de la persona.
     *
     * @return apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido nuevo apellido a establecer
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre completo de la persona en formato "apellido, nombre".
     *
     * @return cadena con el nombre completo formateado
     */
    public String getNombreCompleto() {
        return apellido + ", " + nombre;
    }
}