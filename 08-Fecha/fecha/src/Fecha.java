import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    // Constructor con validación
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        validar();
    }

    // Getters y setters
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return año; }
    public void setDia(int dia) { this.dia = dia; validar(); }
    public void setMes(int mes) { this.mes = mes; validar(); }
    public void setAnio(int año) { this.año = año; validar(); }

    // Método para leer la fecha
    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        this.dia = scanner.nextInt();
        System.out.print("Ingrese el mes: ");
        this.mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        this.año = scanner.nextInt();
        validar();
    }

    // Validar la fecha
    private void validar() {
        if (mes < 1 || mes > 12) mes = 1;
        if (año < 1900 || año > 2050) año = 1900;
        if (dia < 1 || dia > diasDelMes()) dia = 1;
    }

    // Determinar si el año es bisiesto
    public boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Obtener los días de un mes específico
    public int diasDelMes() {
        switch (mes) {
            case 2: return esBisiesto() ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    // Avanzar o retroceder la fecha
    public void fechaTras(long dias) {
        Calendar calendar = new GregorianCalendar(año, mes - 1, dia);
        calendar.add(Calendar.DAY_OF_YEAR, (int) dias);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.año = calendar.get(Calendar.YEAR);
    }

    // Calcular días entre dos fechas
    public int diasEntre(Fecha otraFecha) {
        Calendar fecha1 = new GregorianCalendar(año, mes - 1, dia);
        Calendar fecha2 = new GregorianCalendar(otraFecha.getAnio(), otraFecha.getMes() - 1, otraFecha.getDia());
        long diferencia = Math.abs(fecha1.getTimeInMillis() - fecha2.getTimeInMillis());
        return (int) (diferencia / (1000 * 60 * 60 * 24));
    }

    // Obtener el día de la semana
    public String diaSemana() {
        String[] diasSemana = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };
        Calendar calendar = new GregorianCalendar(año, mes - 1, dia);
        return diasSemana[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    // Formato largo
    public String larga() {
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        return diaSemana() + " " + dia + " de " + meses[mes - 1] + " de " + año;
    }

    // Metodo copia
    public Fecha copia() {
        return new Fecha(dia, mes, año);
    }


    // Métodos de comparación
    public boolean igualQue(Fecha otraFecha) { return this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.año == otraFecha.año; }
    public boolean menorQue(Fecha otraFecha) { return this.diasEntre(otraFecha) > 0; }
    public boolean mayorQue(Fecha otraFecha) { return this.diasEntre(otraFecha) < 0; }

    @Override
    public String toString() { return dia + "/" + mes + "/" + año; }
}
