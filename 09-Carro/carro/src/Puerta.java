public class Puerta {
    private Ventana ventana;
    private boolean abierta;

    public Puerta() {
        this.ventana = new Ventana();
        this.abierta = false;
    }

    public void abrirPuerta() {
        abierta = true;
        System.out.println("La puerta está abierta.");
    }

    public void cerrarPuerta() {
        abierta = false;
        System.out.println("La puerta está cerrada.");
    }

    public void abrirVentana() {
        ventana.abrir();
    }

    public void cerrarVentana() {
        ventana.cerrar();
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }

    public Ventana getVentana() {
        return ventana;
    }

    public void setVentana(Ventana ventana) {
        this.ventana = ventana;
    }
}