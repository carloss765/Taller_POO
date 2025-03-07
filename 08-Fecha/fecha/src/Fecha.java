public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // ? Constructor
    public Fecha(int dia, int mes, int año) {
        this.dia = dia = 1;
        this.mes = mes = 1;
        this.año = año = 1900;
    }

    // ? Getters and Setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return año;
    }

    public String toString() {
        return dia + "/" + mes + "/" + año;
    }

    // ? Metodos

    // ? Leer
    public void leer() {
        System.out.println("Ingrese el dia: ");
        dia = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el mes: ");
        mes = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el año: ");
        año = Integer.parseInt(System.console().readLine());
    }

    // ? Es bisiesto?
    public boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0 || año % 400 == 0);
    }

    // ? Dias del mes
    public int diasDelMes() {
        if (mes == 2) {
            if (esBisiesto()) {
                return 29;
            } else {
                return 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return 30;
        } else {
            return 31;
        }

    }
}