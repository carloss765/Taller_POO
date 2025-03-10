public class Cancion {
    // Atributos
    private String titulo;
    private String autor;

    // Constructor con parámetros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Constructor predeterminado
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    // Método para obtener el título
    public String dameTitulo() {
        return titulo;
    }

    // Método para obtener el autor
    public String dameAutor() {
        return autor;
    }

    // Método para establecer el título
    public void ponTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Método para establecer el autor
    public void ponAutor(String autor) {
        this.autor = autor;
    }

    // Método para mostrar la información de la canción
    @Override
    public String toString() {
        return "Canción: " + titulo + " - Autor: " + autor;
    }
}