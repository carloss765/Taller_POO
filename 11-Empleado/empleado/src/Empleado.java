public class Empleado {
    private String nif;
    private double sueldoBase;
    private double pagoPorHoraExtra;
    private int horasExtraRealizadas;
    private double tipoIRPF;
    private boolean casado;
    private int numeroHijos;

    // Constructor predeterminado
    public Empleado() {
        this.nif = "";
        this.sueldoBase = 0.0;
        this.pagoPorHoraExtra = 0.0;
        this.horasExtraRealizadas = 0;
        this.tipoIRPF = 0.0;
        this.casado = false;
        this.numeroHijos = 0;
    }

    // Constructor parametrizado
    public Empleado(String nif) {
        this();
        this.nif = nif;
    }

    // Accedentes y mutadores
    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public double getPagoPorHoraExtra() {
        return pagoPorHoraExtra;
    }

    public void setPagoPorHoraExtra(double pagoPorHoraExtra) {
        this.pagoPorHoraExtra = pagoPorHoraExtra;
    }

    public int getHorasExtraRealizadas() {
        return horasExtraRealizadas;
    }

    public void setHorasExtraRealizadas(int horasExtraRealizadas) {
        this.horasExtraRealizadas = horasExtraRealizadas;
    }

    public double getTipoIRPF() {
        return tipoIRPF;
    }

    public void setTipoIRPF(double tipoIRPF) {
        this.tipoIRPF = tipoIRPF;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public int getNumeroHijos() {
        return numeroHijos;
    }

    public void setNumeroHijos(int numeroHijos) {
        this.numeroHijos = numeroHijos;
    }

    // Cálculo y devolución del complemento correspondiente a las horas extra realizadas
    public double calcularComplementoHorasExtra() {
        return horasExtraRealizadas * pagoPorHoraExtra;
    }

    // Cálculo y devolución del sueldo bruto
    public double calcularSueldoBruto() {
        return sueldoBase + calcularComplementoHorasExtra();
    }

    // Cálculo y devolución de las retenciones (IRPF)
    public double calcularRetenciones() {
        double porcentajeRetencion = tipoIRPF;
        if (casado) {
            porcentajeRetencion -= 2;
        }
        porcentajeRetencion -= numeroHijos;
        return calcularSueldoBruto() * (porcentajeRetencion / 100);
    }

    // Método para imprimir la información básica del empleado
    public void println() {
        System.out.println("NIF: " + nif);
        System.out.println("Casado: " + (casado ? "Sí" : "No"));
        System.out.println("Número de hijos: " + numeroHijos);
    }

    // Método para imprimir toda la información del empleado
    public void printAll() {
        println();
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Complemento por horas extra: " + calcularComplementoHorasExtra());
        System.out.println("Sueldo bruto: " + calcularSueldoBruto());
        System.out.println("Retenciones de IRPF: " + calcularRetenciones());
        System.out.println("Sueldo neto: " + (calcularSueldoBruto() - calcularRetenciones()));
    }

    // Método para clonar el objeto
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