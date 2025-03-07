public class Nif {
    private long dni;
    private char letra;

    // Constructor predeterminado
    public Nif() {
        this.dni = 0;
        this.letra = ' ';
    }

    // Constructor que recibe el DNI y establece la letra
    public Nif(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }

    // Accedente para el número de DNI
    public long getDni() {
        return dni;
    }

    // Mutador para el número de DNI (ajusta automáticamente la letra)
    public void setDni(long dni) {
        this.dni = dni;
        this.letra = calcularLetra(dni);
    }

    // Método leer() que pide el número de DNI (ajusta automáticamente la letra)
    public void leer() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Introduce el número de DNI: ");
        this.dni = scanner.nextLong();
        this.letra = calcularLetra(this.dni);
    }

    // Método para mostrar el NIF
    public void mostrar() {
        System.out.printf("%08d-%c%n", this.dni, this.letra);
    }

    // Método auxiliar privado para calcular la letra
    private char calcularLetra(long dni) {
        char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
                'L', 'C', 'K', 'E' };
        int indice = (int) (dni % 23);
        return letras[indice];
    }
}
