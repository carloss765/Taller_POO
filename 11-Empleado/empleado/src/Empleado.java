/**
 * Clase que representa a un empleado y gestiona su información salarial y personal.
 * Permite calcular sueldos, complementos, retenciones y gestionar información básica
 * del empleado como su estado civil y número de hijos.
 */
public class Empleado {
    /** Número de identificación fiscal del empleado */
    private String nif;
    /** Sueldo base mensual del empleado */
    private double sueldoBase;
    /** Cantidad a pagar por cada hora extra realizada */
    private double pagoPorHoraExtra;
    /** Número de horas extra realizadas en el mes */
    private int horasExtraRealizadas;
    /** Porcentaje de retención de IRPF base */
    private double tipoIRPF;
    /** Estado civil del empleado (true si está casado) */
    private boolean casado;
    /** Número de hijos del empleado (afecta a las retenciones) */
    private int numeroHijos;

    /**
     * Constructor predeterminado.
     * Inicializa un empleado con valores por defecto.
     */
    public Empleado() {
        this.nif = "";
        this.sueldoBase = 0.0;
        this.pagoPorHoraExtra = 0.0;
        this.horasExtraRealizadas = 0;
        this.tipoIRPF = 0.0;
        this.casado = false;
        this.numeroHijos = 0;
    }

    /**
     * Constructor parametrizado.
     * Crea un empleado con el NIF especificado y el resto de valores por defecto.
     * @param nif Número de identificación fiscal del empleado
     */
    public Empleado(String nif) {
        this();  // Llama al constructor predeterminado
        this.nif = nif;
    }

    // Métodos getter y setter
    /**
     * Obtiene el NIF del empleado.
     * @return NIF del empleado
     */
    public String getNif() {
        return nif;
    }

    /**
     * Establece el NIF del empleado.
     * @param nif nuevo NIF a establecer
     */
    public void setNif(String nif) {
        this.nif = nif;
    }

    /**
     * Obtiene el sueldo base del empleado.
     * @return sueldo base mensual
     */
    public double getSueldoBase() {
        return sueldoBase;
    }

    /**
     * Establece el sueldo base del empleado.
     * @param sueldoBase nuevo sueldo base mensual
     */
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    /**
     * Obtiene el pago por hora extra.
     * @return cantidad pagada por cada hora extra
     */
    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    /**
     * Establece el pago por hora extra.
     * @param pagoPorHoraExtra nueva cantidad a pagar por hora extra
     */
    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    /**
     * Obtiene las horas extra realizadas.
     * @return número de horas extra del mes
     */
    public int getHorasExtraRealizadas() {
        return horasExtraRealizadas;
    }

    /**
     * Establece las horas extra realizadas.
     * @param horasExtraRealizadas nuevo número de horas extra
     */
    public void setHorasExtraRealizadas(int horasExtraRealizadas) {
        this.horasExtraRealizadas = horasExtraRealizadas;
    }

    /**
     * Obtiene el tipo de IRPF.
     * @return porcentaje de IRPF base
     */
    public double getTipoIRPF() {
        return tipoIRPF;
    }

    /**
     * Establece el tipo de IRPF.
     * @param tipoIRPF nuevo porcentaje de IRPF base
     */
    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    /**
     * Verifica si el empleado está casado.
     * @return true si está casado, false en caso contrario
     */
    public boolean isCasado() {
        return casado;
    }

    /**
     * Establece el estado civil del empleado.
     * @param casado true si está casado, false en caso contrario
     */
    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    /**
     * Obtiene el número de hijos del empleado.
     * @return número de hijos
     */
    public int getNumeroHijos() {
        return numeroHijos;
    }

    /**
     * Establece el número de hijos del empleado.
     * @param numeroHijos nuevo número de hijos
     */
    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    /**
     * Calcula el complemento por horas extra del mes.
     * @return importe total del complemento por horas extra
     */
    public double calcularComplementoHorasExtra() {
        return horasExtraRealizadas * pagoPorHoraExtra;
    }

    /**
     * Calcula el sueldo bruto mensual (sueldo base + complementos).
     * @return sueldo bruto total
     */
    public double calcularSueldoBruto() {
        return sueldoBase + calcularComplementoHorasExtra();
    }

    /**
     * Calcula las retenciones de IRPF aplicando las reducciones correspondientes.
     * - Reducción del 2% para empleados casados
     * - Reducción del 1% por cada hijo
     * @return importe total de las retenciones
     */
    public double calcularRetenciones() {
        double porcentajeRetencion = tipoIRPF;
        if (casado) {
            porcentajeRetencion -= 2;  // Reducción por estar casado
        }
        porcentajeRetencion -= numeroHijos;  // Reducción por número de hijos
        return calcularSueldoBruto() * (porcentajeRetencion / 100);
    }

    /**
     * Imprime la información básica del empleado.
     * Muestra NIF, estado civil y número de hijos.
     */
    public void println() {
        System.out.println("NIF: " + nif);
        System.out.println("Casado: " + (casado ? "Sí" : "No"));
        System.out.println("Número de hijos: " + numeroHijos);
    }

    /**
     * Imprime toda la información del empleado.
     * Incluye información básica, salarial y retenciones.
     */
    public void printAll() {
        println();  // Imprime primero la información básica
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Complemento por horas extra: " + calcularComplementoHorasExtra());
        System.out.println("Sueldo bruto: " + calcularSueldoBruto());
        System.out.println("Retenciones de IRPF: " + calcularRetenciones());
        System.out.println("Sueldo neto: " + (calcularSueldoBruto() - calcularRetenciones()));
    }

    /**
     * Crea y devuelve una copia independiente del empleado actual.
     * @return nueva instancia de Empleado con los mismos valores
     */
    public Empleado copia() {
        Empleado copia = new Empleado(this.nif);
        copia.setSueldoBase(this.sueldoBase);
        copia.setPagoPorHoraExtra(this.pagoPorHoraExtra);
        copia.setHorasExtraRealizadas(this.horasExtraRealizadas);
        copia.setTipoIRPF(this.tipoIRPF);
        copia.setCasado(this.casado);
        copia.setNumeroHijos(this.numeroHijos);
        return copia;
    }
}