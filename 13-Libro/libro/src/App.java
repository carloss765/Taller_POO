public class App {
    public static void main(String[] args) {
        // Crear una fecha de edición
        Fecha fechaEdicion = new Fecha(16, 11, 2001);

        // Crear un autor
        Persona autor = new Persona("Y. Daniel", "Liang");

        // Crear un libro
        Libro libro = new Libro(
            "Introduction to Java Programming",
            autor,
            "0-13-031997-X",
            784,
            3,
            "Prentice-Hall",
            "New Jersey",
            "USA",
            fechaEdicion
        );

        // Mostrar la información del libro
        libro.mostrar();

        // Leer la información de un nuevo libro
        Libro nuevoLibro = new Libro("", null, "", 0, 0, "", "", "", new Fecha(1, 1, 1900));
        nuevoLibro.leer();
        nuevoLibro.mostrar();
    }
}