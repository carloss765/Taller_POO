public class App {
    public static void main(String[] args) {
        // Crear un CD
        CD miCD = new CD();

        // Crear algunas canciones
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen");
        Cancion cancion2 = new Cancion("Imagine", "John Lennon");
        Cancion cancion3 = new Cancion("Hotel California", "Eagles");

        // Agregar canciones al CD
        miCD.agrega(cancion1);
        miCD.agrega(cancion2);
        miCD.agrega(cancion3);

        // Mostrar las canciones del CD
        System.out.println("Canciones en el CD:");
        miCD.mostrarCanciones();

        // Obtener el número de canciones
        System.out.println("Número de canciones: " + miCD.numeroCanciones());

        // Obtener una canción específica
        System.out.println("Canción en la posición 1: " + miCD.dameCancion(1).toString());

        // Grabar una nueva canción en una posición específica
        Cancion nuevaCancion = new Cancion("Stairway to Heaven", "Led Zeppelin");
        miCD.grabaCancion(1, nuevaCancion);
        System.out.println("Después de grabar una nueva canción:");
        miCD.mostrarCanciones();

        // Eliminar una canción
        miCD.elimina(0);
        System.out.println("Después de eliminar la primera canción:");
        miCD.mostrarCanciones();
    }
}