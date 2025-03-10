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

    // ? Valida
    /*
     * comprobará si la fecha es correcta (entre el 1-1-1900 y el 31-12-2050);
     * si el día no es correcto, lo pondrá a 1; si el mes no es correcto, lo pondrá
     * a 1;
     * y si el año no es correcto, lo pondrá a 1900. Será un método auxiliar
     * (privado).
     * Este método se llamará en el constructor parametrizado y en leer()
     */
    private void validar() {
        if (dia < 1 || dia > diasDelMes()) {
            dia = 1;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (año < 1900 || año > 2050) {
            año = 1900;
        }
    }

    // ? Corta
    public void cortar() {
        System.out.println("La fecha es: " + dia + "/" + mes + "/" + año
                + "\nEs bisiesto: " + esBisiesto());
    }

    // ? DiasTranscurridos
    /*
     * devolverá el número de días transcurridos
     * desde el 1-1-1900 hasta la fecha.
     */
    public int diasTranscurridos() {
        int dias = 0;

        // Sumar días de los años completos (desde 1900 hasta el año anterior)
        for (int i = 1900; i < año; i++) {
            if (esBisiesto(i)) {
                dias += 366; // Año bisiesto
            } else {
                dias += 365; // Año no bisiesto
            }
        }
        // Sumar días de los meses completos en el año actual
        for (int i = 1; i < mes; i++) {
            dias += diasDelMes(i, año);
        }

        // Sumar días del mes actual
        dias += dia;

        return dias;
    }

    // Método auxiliar para verificar si un año es bisiesto
    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    // Método auxiliar para obtener los días de un mes específico en un año
    // específico
    private int diasDelMes(int mes, int año) {
        switch (mes) {
            case 2: // Febrero
                return esBisiesto(año) ? 29 : 28;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                return 30;
            default:
                return 31;
        }
    }

    // ? DiaSemana
    public int diaSemana() {
        int dias = diasTranscurridos(); // Usa el método ya implementado
        return dias % 7; // El 1-1-1900 fue domingo (0)
    }

    // ? Larga
    public String larga() {
        String[] diasSemana = { "domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado" };
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        return diasSemana[diaSemana()] + " " + dia + " de " + meses[mes - 1] + " de " + año;
    }

    // ? FechaTras(long)
    public void fechaTras(long dias) {
        // Convertir la fecha actual a días desde 1-1-1900
        long totalDias = diasTranscurridos() + dias;

        // Reiniciar la fecha a 1-1-1900 y sumar los días
        año = 1900;
        mes = 1;
        dia = 1;

        while (totalDias > 0) {
            int diasEnAnio = esBisiesto() ? 366 : 365;
            if (totalDias >= diasEnAnio) {
                totalDias -= diasEnAnio;
                año++;
            } else {
                int diasEnMes = diasDelMes();
                if (totalDias >= diasEnMes) {
                    totalDias -= diasEnMes;
                    mes++;
                    if (mes > 12) {
                        mes = 1;
                        año++;
                    }
                } else {
                    dia += totalDias;
                    totalDias = 0;
                }
            }
        }
        validar(); // Asegurar que la fecha sea válida
    }

    // ? DiasEntre(Fecha)
    public int diasEntre(Fecha otraFecha) {
        return Math.abs(this.diasTranscurridos() - otraFecha.diasTranscurridos());
    }

    // ? Siguiente
    public void siguiente() {
        dia++;
        if (dia > diasDelMes()) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        validar(); // Asegurar que la fecha sea válida
    }

    // ? Anterior
    public void anterior() {
        dia--;
        if (dia < 1) {
            mes--;
            if (mes < 1) {
                mes = 12;
                año--;
            }
            dia = diasDelMes();
        }
        validar(); // Asegurar que la fecha sea válida
    }

    // ? Copia
    public Fecha copia() {
        return new Fecha(dia, mes, año);
    }

    // ? IgualQue
    public boolean igualQue(Fecha otraFecha) {
        return this.dia == otraFecha.dia && this.mes == otraFecha.mes && this.año == otraFecha.año;
    }

    // ? MenorQue
    public boolean menorQue(Fecha otraFecha) {
        if (this.año < otraFecha.año) {
            return true;
        } else if (this.año == otraFecha.año && this.mes < otraFecha.mes) {
            return true;
        } else if (this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia < otraFecha.dia) {
            return true;
        }
        return false;
    }

    // ? MayorQue
    public boolean mayorQue(Fecha otraFecha) {
        if (this.año > otraFecha.año) {
            return true;
        } else if (this.año == otraFecha.año && this.mes > otraFecha.mes) {
            return true;
        } else if (this.año == otraFecha.año && this.mes == otraFecha.mes && this.dia > otraFecha.dia) {
            return true;
        }

        return false;
    }
}