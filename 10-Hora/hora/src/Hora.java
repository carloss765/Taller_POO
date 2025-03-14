import java.util.Scanner;

/**
 * Clase que representa una hora del día en formato 24 horas.
 * Permite manipular y realizar operaciones con horas, minutos y segundos.
 * Mantiene la hora en un formato válido (00:00:00 a 23:59:59).
 */
public class Hora {
    /** Hora del día (0-23) */
    private int hora;
    /** Minutos (0-59) */
    private int minuto;
    /** Segundos (0-59) */
    private int segundo;

    /**
     * Constructor predeterminado.
     * Inicializa la hora a medianoche (00:00:00).
     */
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /**
     * Constructor parametrizado.
     * Crea una hora con los valores especificados y la valida.
     *
     * @param hora hora del día (0-23)
     * @param minuto minutos (0-59)
     * @param segundo segundos (0-59)
     */
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        valida();  // Asegura que los valores estén en rangos válidos
    }

    /**
     * Lee la hora desde la entrada estándar.
     * Solicita al usuario que ingrese hora, minutos y segundos por separado.
     */
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        this.hora = scanner.nextInt();
        System.out.print("Ingrese los minutos: ");
        this.minuto = scanner.nextInt();
        System.out.print("Ingrese los segundos: ");
        this.segundo = scanner.nextInt();
        valida();  // Valida los valores ingresados
    }

    /**
     * Valida y ajusta los componentes de la hora para mantener rangos correctos.
     * - Ajusta segundos >= 60 incrementando minutos
     * - Ajusta minutos >= 60 incrementando horas
     * - Ajusta horas >= 24 aplicando módulo 24
     */
    private void valida() {
        // Ajuste de segundos
        if (this.segundo >= 60) {
            this.minuto += this.segundo / 60;
            this.segundo = this.segundo % 60;
        }
        // Ajuste de minutos
        if (this.minuto >= 60) {
            this.hora += this.minuto / 60;
            this.minuto = this.minuto % 60;
        }
        // Ajuste de horas
        if (this.hora >= 24) {
            this.hora = this.hora % 24;
        }
    }

    // Métodos getter y setter con validación
    /**
     * Obtiene la hora del día.
     * @return hora (0-23)
     */
    public int getHora() {
        return hora;
    }

    /**
     * Establece la hora del día y valida el resultado.
     * @param hora nueva hora a establecer
     */
    public void setHora(int hora) {
        this.hora = hora;
        valida();
    }

    /**
     * Obtiene los minutos.
     * @return minutos (0-59)
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     * Establece los minutos y valida el resultado.
     * @param minuto nuevos minutos a establecer
     */
    public void setMinuto(int minuto) {
        this.minuto = minuto;
        valida();
    }

    /**
     * Obtiene los segundos.
     * @return segundos (0-59)
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Establece los segundos y valida el resultado.
     * @param segundo nuevos segundos a establecer
     */
    public void setSegundo(int segundo) {
        this.segundo = segundo;
        valida();
    }

    /**
     * Imprime la hora en formato HH:MM:SS.
     */
    public void print() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }

    /**
     * Convierte la hora actual a segundos desde la medianoche.
     * @return total de segundos desde las 00:00:00
     */
    public int aSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    /**
     * Establece la hora a partir de segundos desde la medianoche.
     * @param segundos total de segundos desde las 00:00:00
     */
    public void deSegundos(int segundos) {
        this.hora = segundos / 3600;
        segundos %= 3600;
        this.minuto = segundos / 60;
        this.segundo = segundos % 60;
        valida();
    }

    /**
     * Calcula la diferencia en segundos entre esta hora y otra.
     * @param otra hora con la que comparar
     * @return diferencia absoluta en segundos
     */
    public int segundosDesde(Hora otra) {
        return Math.abs(this.aSegundos() - otra.aSegundos());
    }

    /**
     * Avanza la hora un segundo.
     */
    public void siguiente() {
        this.segundo++;
        valida();
    }

    /**
     * Retrocede la hora un segundo.
     * Maneja correctamente el cambio de hora y día.
     */
    public void anterior() {
        this.segundo--;
        if (this.segundo < 0) {
            this.segundo = 59;
            this.minuto--;
            if (this.minuto < 0) {
                this.minuto = 59;
                this.hora--;
                if (this.hora < 0) {
                    this.hora = 23;
                }
            }
        }
    }

    /**
     * Crea y devuelve una copia independiente de esta hora.
     * @return nueva instancia de Hora con los mismos valores
     */
    public Hora copia() {
        return new Hora(this.hora, this.minuto, this.segundo);
    }

    /**
     * Compara si esta hora es igual a otra.
     * @param otra hora a comparar
     * @return true si las horas son iguales, false en caso contrario
     */
    public boolean igualQue(Hora otra) {
        return this.hora == otra.hora && this.minuto == otra.minuto && this.segundo == otra.segundo;
    }

    /**
     * Compara si esta hora es menor que otra.
     * @param otra hora a comparar
     * @return true si esta hora es anterior a la otra, false en caso contrario
     */
    public boolean menorQue(Hora otra) {
        return this.aSegundos() < otra.aSegundos();
    }

    /**
     * Compara si esta hora es mayor que otra.
     * @param otra hora a comparar
     * @return true si esta hora es posterior a la otra, false en caso contrario
     */
    public boolean mayorQue(Hora otra) {
        return this.aSegundos() > otra.aSegundos();
    }
}