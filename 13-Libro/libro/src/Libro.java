import java.util.Scanner;

/**
 * Clase que representa un libro y toda su información bibliográfica.
 * Gestiona los datos completos de un libro incluyendo título, autor,
 * información editorial y detalles de publicación.
 */
public class Libro {
    /** Título completo del libro */
    private String titulo;
    /** Autor del libro como objeto Persona */
    private Persona autor;
    /** Número ISBN (International Standard Book Number) */
    private String ISBN;
    /** Número total de páginas del libro */
    private int paginas;
    /** Número de edición del libro */
    private int edicion;
    /** Nombre de la editorial */
    private String editorial;
    /** Ciudad de publicación */
    private String ciudad;
    /** País de publicación */
    private String pais;
    /** Fecha de edición como objeto Fecha */
    private Fecha fechaEdicion;

    /**
     * Constructor que crea un libro con todos sus datos.
     *
     * @param titulo título del libro
     * @param autor objeto Persona que representa al autor
     * @param ISBN código ISBN del libro
     * @param paginas número total de páginas
     * @param edicion número de edición
     * @param editorial nombre de la editorial
     * @param ciudad ciudad de publicación
     * @param pais país de publicación
     * @param fechaEdicion objeto Fecha con la fecha de edición
     */
    public Libro(String titulo, Persona autor, String ISBN, int paginas, int edicion,
                String editorial, String ciudad, String pais, Fecha fechaEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.paginas = paginas;
        this.edicion = edicion;
        this.editorial = editorial;
        this.ciudad = ciudad;
        this.pais = pais;
        this.fechaEdicion = fechaEdicion;
    }

    // Métodos getter y setter con documentación
    /**
     * Obtiene el título del libro.
     * @return título del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * @param titulo nuevo título del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro.
     * @return objeto Persona que representa al autor
     */
    public Persona getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro.
     * @param autor nuevo objeto Persona como autor
     */
    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el ISBN del libro.
     * @return código ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Establece el ISBN del libro.
     * @param ISBN nuevo código ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Obtiene el número de páginas.
     * @return número total de páginas
     */
    public int getPaginas() {
        return paginas;
    }

    /**
     * Establece el número de páginas.
     * @param paginas nuevo número de páginas
     */
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    /**
     * Obtiene el número de edición.
     * @return número de edición
     */
    public int getEdicion() {
        return edicion;
    }

    /**
     * Establece el número de edición.
     * @param edicion nuevo número de edición
     */
    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    /**
     * Obtiene el nombre de la editorial.
     * @return nombre de la editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * Establece el nombre de la editorial.
     * @param editorial nueva editorial
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * Obtiene la ciudad de publicación.
     * @return ciudad de publicación
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Establece la ciudad de publicación.
     * @param ciudad nueva ciudad de publicación
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el país de publicación.
     * @return país de publicación
     */
    public String getPais() {
        return pais;
    }

    /**
     * Establece el país de publicación.
     * @param pais nuevo país de publicación
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * Obtiene la fecha de edición.
     * @return objeto Fecha con la fecha de edición
     */
    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }

    /**
     * Establece la fecha de edición.
     * @param fechaEdicion nueva fecha de edición
     */
    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    /**
     * Lee todos los datos del libro desde la entrada estándar.
     * Solicita al usuario que ingrese cada uno de los campos necesarios
     * para completar la información del libro.
     */
    public void leer() {
        Scanner scanner = new Scanner(System.in);

        // Lectura de datos básicos
        System.out.print("Ingrese el título: ");
        this.titulo = scanner.nextLine();

        // Lectura de datos del autor
        System.out.print("Ingrese el nombre del autor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del autor: ");
        String apellido = scanner.nextLine();
        this.autor = new Persona(nombre, apellido);

        // Lectura de datos de identificación y extensión
        System.out.print("Ingrese el ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.paginas = scanner.nextInt();
        System.out.print("Ingrese la edición: ");
        this.edicion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        // Lectura de datos de publicación
        System.out.print("Ingrese la editorial: ");
        this.editorial = scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        this.ciudad = scanner.nextLine();
        System.out.print("Ingrese el país: ");
        this.pais = scanner.nextLine();

        // Lectura de la fecha de edición
        System.out.println("Ingrese la fecha de edición:");
        this.fechaEdicion = new Fecha(1, 1, 1900); // Fecha inicial por defecto
        this.fechaEdicion.leer();
    }

    /**
     * Muestra toda la información del libro en un formato estructurado.
     * Incluye título, edición, autor, ISBN, datos de publicación y número de páginas.
     */
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println(edicion + "a. edición");
        System.out.println("Autor: " + autor.getNombreCompleto());
        System.out.println("ISBN: " + ISBN);
        System.out.println(editorial + ", " + ciudad + " (" + pais + "), " + fechaEdicion.larga());
        System.out.println(paginas + " páginas");
    }
}