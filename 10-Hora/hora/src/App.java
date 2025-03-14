/**
 * Clase principal que demuestra el uso de la clase Hora.
 * Contiene ejemplos de todas las operaciones disponibles con la clase Hora,
 * incluyendo creación, modificación, comparación y conversión de horas.
 */
public class App {
    /**
     * Método principal que ejecuta una serie de pruebas para demostrar
     * la funcionalidad de la clase Hora.
     *
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // SECCIÓN 1: Creación de objetos Hora
        // Crear una instancia usando el constructor predeterminado (00:00:00)
        Hora hora1 = new Hora();
        System.out.println("Hora predeterminada:");
        hora1.print();

        // Crear una instancia usando el constructor parametrizado (23:59:59)
        Hora hora2 = new Hora(23, 59, 59);
        System.out.println("Hora parametrizada:");
        hora2.print();

        // SECCIÓN 2: Entrada de usuario
        // Crear una nueva hora y permitir al usuario establecer los valores
        Hora hora3 = new Hora();
        System.out.println("Ingrese una hora:");
        hora3.leer();
        System.out.println("Hora ingresada:");
        hora3.print();

        // SECCIÓN 3: Conversiones de tiempo
        // Demostración de conversión de hora a segundos desde medianoche
        int segundos = hora3.aSegundos();
        System.out.println("Segundos desde la medianoche: " + segundos);

        // Demostración de conversión de segundos a hora
        Hora hora4 = new Hora();
        hora4.deSegundos(segundos);
        System.out.println("Hora establecida desde segundos:");
        hora4.print();

        // SECCIÓN 4: Cálculos de tiempo
        // Calcular la diferencia en segundos entre dos horas
        int segundosDesde = hora2.segundosDesde(hora3);
        System.out.println("Segundos entre hora2 y hora3: " + segundosDesde);

        // SECCIÓN 5: Manipulación de tiempo
        // Demostración de avance de tiempo
        hora3.siguiente();
        System.out.println("Hora después de avanzar un segundo:");
        hora3.print();

        // Demostración de retroceso de tiempo
        hora3.anterior();
        System.out.println("Hora después de retroceder un segundo:");
        hora3.print();

        // SECCIÓN 6: Clonación
        // Demostración de la creación de una copia independiente
        Hora hora5 = hora3.copia();
        System.out.println("Hora clonada:");
        hora5.print();

        // SECCIÓN 7: Comparaciones
        // Demostración de los diferentes métodos de comparación
        System.out.println("hora3 es igual a hora5: " + hora3.igualQue(hora5));
        System.out.println("hora3 es menor que hora2: " + hora3.menorQue(hora2));
        System.out.println("hora3 es mayor que hora2: " + hora3.mayorQue(hora2));
    }
}