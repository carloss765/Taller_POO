
public class App {
    public static void main(String[] args) {
        // Crear una instancia de Hora usando el constructor predeterminado
        Hora hora1 = new Hora();
        System.out.println("Hora predeterminada:");
        hora1.print();

        // Crear una instancia de Hora usando el constructor parametrizado
        Hora hora2 = new Hora(23, 59, 59);
        System.out.println("Hora parametrizada:");
        hora2.print();

        // Leer una hora desde el usuario
        Hora hora3 = new Hora();
        System.out.println("Ingrese una hora:");
        hora3.leer();
        System.out.println("Hora ingresada:");
        hora3.print();

        // Convertir la hora a segundos desde la medianoche
        int segundos = hora3.aSegundos();
        System.out.println("Segundos desde la medianoche: " + segundos);

        // Establecer la hora a partir de segundos desde la medianoche
        Hora hora4 = new Hora();
        hora4.deSegundos(segundos);
        System.out.println("Hora establecida desde segundos:");
        hora4.print();

        // Calcular los segundos desde otra hora
        int segundosDesde = hora2.segundosDesde(hora3);
        System.out.println("Segundos entre hora2 y hora3: " + segundosDesde);

        // Avanzar al siguiente segundo
        hora3.siguiente();
        System.out.println("Hora después de avanzar un segundo:");
        hora3.print();

        // Retroceder al segundo anterior
        hora3.anterior();
        System.out.println("Hora después de retroceder un segundo:");
        hora3.print();

        // Clonar una hora
        Hora hora5 = hora3.copia();
        System.out.println("Hora clonada:");
        hora5.print();

        // Comparar horas
        System.out.println("hora3 es igual a hora5: " + hora3.igualQue(hora5));
        System.out.println("hora3 es menor que hora2: " + hora3.menorQue(hora2));
        System.out.println("hora3 es mayor que hora2: " + hora3.mayorQue(hora2));
    }
}