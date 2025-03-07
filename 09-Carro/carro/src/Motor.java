public class Motor {
    private boolean encendido;

    public Motor() {
        this.encendido = false;
    }

    public void arrancar() {
        encendido = true;
        System.out.println("El motor está arrancado.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El motor está apagado.");
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
}