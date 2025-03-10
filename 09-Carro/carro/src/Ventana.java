public class Ventana {
    private boolean abierta;

    public Ventana() {
        this.abierta = false;
    }

    public void abrir() {
        abierta = true;
        System.out.println("La ventana está abierta.");
    }

    public void cerrar() {
        abierta = false;
        System.out.println("La ventana está cerrada.");
    }

    public boolean isAbierta() {
        return abierta;
    }

    public void setAbierta(boolean abierta) {
        this.abierta = abierta;
    }
}