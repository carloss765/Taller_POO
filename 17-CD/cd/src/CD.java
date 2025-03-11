public class CD {
    private Cancion[] canciones;
    private int contador;

    // Constructor predeterminado
    public CD() {
        canciones = new Cancion[10]; // Tamaño inicial del array
        contador = 0; // Inicializar el contador
    }

    // Método para obtener el número de canciones
    public int numeroCanciones() {
        return contador;
    }

    // Método para obtener una canción en una posición específica
    public Cancion dameCancion(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            return canciones[posicion];
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
    }

    // Método para grabar una canción en una posición específica
    public void grabaCancion(int posicion, Cancion nuevaCancion) {
        if (posicion >= 0 && posicion < contador) {
            canciones[posicion] = nuevaCancion;
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
    }

    // Método para agregar una canción al final del array
    public void agrega(Cancion cancion) {
        if (contador < canciones.length) {
            canciones[contador] = cancion;
            contador++;
        } else {
            // Si el array está lleno, se puede redimensionar
            redimensionarArray();
            canciones[contador] = cancion;
            contador++;
        }
    }

    // Método para eliminar una canción en una posición específica
    public void elimina(int posicion) {
        if (posicion >= 0 && posicion < contador) {
            for (int i = posicion; i < contador - 1; i++) {
                canciones[i] = canciones[i + 1];
            }
            canciones[contador - 1] = null; // Eliminar la última referencia
            contador--;
        } else {
            throw new IllegalArgumentException("Posición no válida");
        }
    }

    // Método auxiliar para redimensionar el array si está lleno
    private void redimensionarArray() {
        Cancion[] nuevoArray = new Cancion[canciones.length * 2];
        System.arraycopy(canciones, 0, nuevoArray, 0, canciones.length);
        canciones = nuevoArray;
    }

    // Método para mostrar todas las canciones del CD
    public void mostrarCanciones() {
        for (int i = 0; i < contador; i++) {
            System.out.println("Canción " + (i + 1) + ": " + canciones[i].toString());
        }
    }
}