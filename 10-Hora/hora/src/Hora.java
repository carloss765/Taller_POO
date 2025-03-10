import java.util.Scanner;

public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    // Constructor predeterminado
    public Hora() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    // Constructor parametrizado
    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        valida();
    }

    // Método para leer la hora del usuario
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la hora: ");
        this.hora = scanner.nextInt();
        System.out.print("Ingrese los minutos: ");
        this.minuto = scanner.nextInt();
        System.out.print("Ingrese los segundos: ");
        this.segundo = scanner.nextInt();
        valida();
    }

    // Método para validar la hora
    private void valida() {
        if (this.segundo >= 60) {
            this.minuto += this.segundo / 60;
            this.segundo = this.segundo % 60;
        }
        if (this.minuto >= 60) {
            this.hora += this.minuto / 60;
            this.minuto = this.minuto % 60;
        }
        if (this.hora >= 24) {
            this.hora = this.hora % 24;
        }
    }

    // Accedentes y mutadores
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
        valida();
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
        valida();
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
        valida();
    }

    // Método para imprimir la hora
    public void print() {
        System.out.printf("%02d:%02d:%02d\n", hora, minuto, segundo);
    }

    // Método para convertir la hora a segundos desde la medianoche
    public int aSegundos() {
        return hora * 3600 + minuto * 60 + segundo;
    }

    // Método para establecer la hora a partir de segundos desde la medianoche
    public void deSegundos(int segundos) {
        this.hora = segundos / 3600;
        segundos %= 3600;
        this.minuto = segundos / 60;
        this.segundo = segundos % 60;
        valida();
    }

    // Método para calcular los segundos desde otra hora
    public int segundosDesde(Hora otra) {
        return Math.abs(this.aSegundos() - otra.aSegundos());
    }

    // Método para avanzar al siguiente segundo
    public void siguiente() {
        this.segundo++;
        valida();
    }

    // Método para retroceder al segundo anterior
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

    // Método para clonar la hora
    public Hora copia() {
        return new Hora(this.hora, this.minuto, this.segundo);
    }

    // Método para comparar si la hora es igual a otra
    public boolean igualQue(Hora otra) {
        return this.hora == otra.hora && this.minuto == otra.minuto && this.segundo == otra.segundo;
    }

    // Método para comparar si la hora es menor que otra
    public boolean menorQue(Hora otra) {
        return this.aSegundos() < otra.aSegundos();
    }

    // Método para comparar si la hora es mayor que otra
    public boolean mayorQue(Hora otra) {
        return this.aSegundos() > otra.aSegundos();
    }
}