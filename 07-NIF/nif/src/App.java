public class App {
    // Esta es la clase principal que contiene el método main

    public static void main(String[] args) throws Exception {
        // Este es el método principal que se ejecuta al iniciar el programa

        // Primer objeto NIF
        Nif nif1 = new Nif();      // Se crea una primera instancia de la clase Nif
        nif1.leer();               // Se llama al método leer() que probablemente pide al usuario ingresar un DNI
        nif1.mostrar();            // Se llama al método mostrar() que probablemente muestra el DNI con su letra

        // Segundo objeto NIF
        Nif nif2 = new Nif();      // Se crea una segunda instancia de la clase Nif
        nif2.leer();               // Se repite el proceso de lectura para el segundo NIF
        nif2.mostrar();            // Se muestra el segundo NIF
    }
}