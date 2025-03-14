/**
 * Clase que representa un CD (Compact Disc) y gestiona su colección de canciones.
 * Permite almacenar, modificar y administrar un conjunto de canciones,
 * con capacidad de expansión automática cuando sea necesario.
 */
public class CD {
    /** Array que almacena las canciones del CD */
    private Cancion[] canciones;

    /** Contador que mantiene el número actual de canciones en el CD */
    private int contador;

    /**
     * Constructor predeterminado.
     * Inicializa un CD vacío con capacidad inicial para 10 canciones.
     */
    public CD() {
        canciones = new Cancion[10]; // Tamaño inicial del array
        contador = 0;                // Inicializar el contador de canciones
    }

    /**
     * Obtiene el número actual de canciones en el CD.
     *
     * @return número de canciones almacenadas
     */
    public int numeroCanciones() {
        return contador;
    }

    /**
     * Obtiene una canción específica del CD según su posición.
     *
     * @param posicion índice de la canción a recuperar (0-based)
     * @return la canción en la posición especificada
     * @throws IllegalArgumentException si la posición no es válida
     */
    public Cancion dameCancion(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            return canciones[posicion];
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
    }

    /**
     * Reemplaza una canción existente en una posición específica.
     *
     * @param posicion índice donde se grabará la nueva canción
     * @param nuevaCancion canción que reemplazará a la existente
     * @throws IllegalArgumentException si la posición no es válida
     */
    public void grabaCancion(int posicion, Cancion nuevaCancion) {
        if (posicion >= 0 && posicion < contador) {
            canciones[posicion] = nuevaCancion;
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
    }

    /**
     * Agrega una nueva canción al final del CD.
     * Si el array está lleno, se redimensiona automáticamente.
     *
     * @param cancion nueva canción a agregar
     */
    public void agrega(Cancion cancion) {
        if (contador < canciones.length) {
            // Si hay espacio, agregar directamente
            canciones[contador] = cancion;
            contador++;
        } else {
            // Si el array está lleno, redimensionar y luego agregar
            redimensionarArray();
            canciones[contador] = cancion;
            contador++;
        }
    }

    /**
     * Elimina una canción del CD en una posición específica.
     * Desplaza todas las canciones posteriores una posición hacia atrás.
     *
     * @param posicion índice de la canción a eliminar
     * @throws IllegalArgumentException si la posición no es válida
     */
    public void elimina(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            // Desplazar elementos posteriores una posición hacia atrás
            for (int i = posicion; i < contador - 1; i++) {
                canciones[i] = canciones[i + 1];
            }
            canciones[contador - 1] = null; // Eliminar la última referencia
            contador--;
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
    }

    /**
     * Método privado que duplica el tamaño del array cuando está lleno.
     * Crea un nuevo array con el doble de capacidad y copia los elementos existentes.
     */
    private void redimensionarArray() {
        Cancion[] nuevoArray = new Cancion[canciones.length * 2];
        System.arraycopy(canciones, 0, nuevoArray, 0, canciones.length);
        canciones = nuevoArray;
    }

    /**
     * Muestra todas las canciones almacenadas en el CD.
     * Imprime cada canción con su número de orden (comenzando en 1).
     */
    public void mostrarCanciones() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Canción " + (i + 1) + ": " + canciones[i].toString());
        }
    }
}