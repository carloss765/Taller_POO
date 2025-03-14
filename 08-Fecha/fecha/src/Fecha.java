
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Clase que representa una fecha y proporciona operaciones para su manipulación.
 * Permite crear, modificar y comparar fechas, así como realizar cálculos entre ellas.
 * El rango válido de fechas es entre el año 1900 y 2050.
 */
public class Fecha {
    private int dia;    // Día del mes (1-31)
    private int mes;    // Mes del año (1-12)
    private int año;    // Año (1900-2050)

    /**
     * Constructor que crea una nueva fecha con los valores especificados.
     * Los valores se validan automáticamente.
     *
     * @param dia Día del mes
     * @param mes Mes del año
     * @param año Año de la fecha
     */
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        validar();
    }

    // Métodos getter y setter con validación
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAnio() { return año; }

    /**
     * Establece el día de la fecha y valida la fecha resultante.
     * @param dia Nuevo día del mes
     */
    public void setDia(int dia) { this.dia = dia; validar(); }

    /**
     * Establece el mes de la fecha y valida la fecha resultante.
     * @param mes Nuevo mes del año
     */
    public void setMes(int mes) { this.mes = mes; validar(); }

    /**
     * Establece el año de la fecha y valida la fecha resultante.
     * @param año Nuevo año
     */
    public void setAnio(int año) { this.año = año; validar(); }

    /**
     * Lee una fecha desde la entrada estándar.
     * Solicita al usuario que ingrese día, mes y año por separado.
     */
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

    /**
     * Valida y ajusta los componentes de la fecha para asegurar que sean válidos.
     * - Mes debe estar entre 1 y 12
     * - Año debe estar entre 1900 y 2050
     * - Día debe ser válido para el mes y año especificados
     */
    private void validar() {
        if (mes < 1 || mes > 12) mes = 1;
        if (año < 1900 || año > 2050) año = 1900;
        if (dia < 1 || dia > diasDelMes()) dia = 1;
    }

    /**
     * Determina si el año actual es bisiesto.
     * @return true si el año es bisiesto, false en caso contrario
     */
    public boolean esBisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    /**
     * Calcula el número de días del mes actual.
     * @return número de días del mes actual
     */
    public int diasDelMes() {
        switch (mes) {
            case 2: return esBisiesto() ? 29 : 28;
            case 4: case 6: case 9: case 11: return 30;
            default: return 31;
        }
    }

    /**
     * Avanza o retrocede la fecha el número especificado de días.
     * @param dias número de días a avanzar (positivo) o retroceder (negativo)
     */
    public void fechaTras(long dias) {
        Calendar calendar = new GregorianCalendar(año, mes - 1, dia);
        calendar.add(Calendar.DAY_OF_YEAR, (int) dias);
        this.dia = calendar.get(Calendar.DAY_OF_MONTH);
        this.mes = calendar.get(Calendar.MONTH) + 1;
        this.año = calendar.get(Calendar.YEAR);
    }

    /**
     * Calcula el número de días entre esta fecha y otra.
     * @param otraFecha fecha con la que calcular la diferencia
     * @return número absoluto de días entre las dos fechas
     */
    public int diasEntre(Fecha otraFecha) {
        Calendar fecha1 = new GregorianCalendar(año, mes - 1, dia);
        Calendar fecha2 = new GregorianCalendar(otraFecha.getAnio(), otraFecha.getMes() - 1, otraFecha.getDia());
        long diferencia = Math.abs(fecha1.getTimeInMillis() - fecha2.getTimeInMillis());
        return (int) (diferencia / (1000 * 60 * 60 * 24));
    }

    /**
     * Obtiene el nombre del día de la semana de la fecha actual.
     * @return nombre del día de la semana (Lunes, Martes, etc.)
     */
    public String diaSemana() {
        String[] diasSemana = { "Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" };
        Calendar calendar = new GregorianCalendar(año, mes - 1, dia);
        return diasSemana[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    /**
     * Devuelve la fecha en formato largo (ejemplo: "Lunes 1 de Enero de 2023").
     * @return cadena con la fecha en formato largo
     */
    public String larga() {
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
                          "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
        return diaSemana() + " " + dia + " de " + meses[mes - 1] + " de " + año;
    }

    /**
     * Crea y devuelve una copia de esta fecha.
     * @return nueva instancia de Fecha con los mismos valores
     */
    public Fecha copia() {
        return new Fecha(dia, mes, año);
    }

    /**
     * Compara si esta fecha es igual a otra.
     * @param otraFecha fecha a comparar
     * @return true si las fechas son iguales, false en caso contrario
     */
    public boolean igualQue(Fecha otraFecha) {
        return this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.año == otraFecha.año;
    }

    /**
     * Compara si esta fecha es menor que otra.
     * @param otraFecha fecha a comparar
     * @return true si esta fecha es menor que la otra, false en caso contrario
     */
    public boolean menorQue(Fecha otraFecha) {
        return this.diasEntre(otraFecha) > 0;
    }

    /**
     * Compara si esta fecha es mayor que otra.
     * @param otraFecha fecha a comparar
     * @return true si esta fecha es mayor que la otra, false en caso contrario
     */
    public boolean mayorQue(Fecha otraFecha) {
        return this.diasEntre(otraFecha) < 0;
    }

    /**
     * Devuelve una representación en cadena de la fecha en formato corto (dd/mm/aaaa).
     * @return cadena que representa la fecha
     */
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}
