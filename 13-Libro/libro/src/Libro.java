import java.util.Scanner;

public class Libro {
    private String titulo;
    private Persona autor;
    private String ISBN;
    private int paginas;
    private int edicion;
    private String editorial;
    private String ciudad;
    private String pais;
    private Fecha fechaEdicion;

    // Constructor
    public Libro(String titulo, Persona autor, String ISBN, int paginas, int edicion, String editorial, String ciudad, String pais, Fecha fechaEdicion) {
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

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Fecha getFechaEdicion() {
        return fechaEdicion;
    }

    public void setFechaEdicion(Fecha fechaEdicion) {
        this.fechaEdicion = fechaEdicion;
    }

    // Método para leer la información del libro
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el nombre del autor: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el apellido del autor: ");
        String apellido = scanner.nextLine();
        this.autor = new Persona(nombre, apellido);
        System.out.print("Ingrese el ISBN: ");
        this.ISBN = scanner.nextLine();
        System.out.print("Ingrese el número de páginas: ");
        this.paginas = scanner.nextInt();
        System.out.print("Ingrese la edición: ");
        this.edicion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese la editorial: ");
        this.editorial = scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        this.ciudad = scanner.nextLine();
        System.out.print("Ingrese el país: ");
        this.pais = scanner.nextLine();
        System.out.println("Ingrese la fecha de edición:");
        this.fechaEdicion = new Fecha(1, 1, 1900); // Fecha inicial
        this.fechaEdicion.leer();
    }

    // Método para mostrar la información del libro
    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println(edicion + "a. edición");
        System.out.println("Autor: " + autor.getNombreCompleto());
        System.out.println("ISBN: " + ISBN);
        System.out.println(editorial + ", " + ciudad + " (" + pais + "), " + fechaEdicion.larga());
        System.out.println(paginas + " páginas");
    }
}