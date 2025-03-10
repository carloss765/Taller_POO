public class App {
    public static void main(String[] args) {
        // Crear una canción usando el constructor con parámetros
        Cancion cancion1 = new Cancion("Bohemian Rhapsody", "Queen");
        System.out.println("Canción 1: " + cancion1.toString());

        // Crear una canción usando el constructor predeterminado
        Cancion cancion2 = new Cancion();
        System.out.println("Canción 2 (inicial): " + cancion2.toString());

        // Establecer título y autor usando los métodos
        cancion2.ponTitulo("Imagine");
        cancion2.ponAutor("John Lennon");
        System.out.println("Canción 2 (actualizada): " + cancion2.toString());

        // Obtener título y autor usando los métodos
        System.out.println("Título de la canción 1: " + cancion1.dameTitulo());
        System.out.println("Autor de la canción 1: " + cancion1.dameAutor());
    }
}