public class Rueda {
    private boolean inflada;

    public Rueda() {
        this.inflada = false;
    }

    public void inflar() {
        inflada = true;
        System.out.println("La rueda está inflada.");
    }

    public void desinflar() {
        inflada = false;
        System.out.println("La rueda está desinflada.");
    }

    public void cambiar() {
        inflada = false;
        System.out.println("La rueda ha sido cambiada.");
    }

    public void cambiarLlanta() {
        inflada = false;
        System.out.println("La llanta ha sido cambiada.");
    }

    public boolean isInflada() {
        return inflada;
    }

    public void setInflada(boolean inflada) {
        this.inflada = inflada;
    }
}