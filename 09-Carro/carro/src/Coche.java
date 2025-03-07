public class Coche {
    private Motor motor;
    private Rueda[] ruedas;
    private Puerta[] puertas;

    public Coche() {
        this.motor = new Motor();
        this.ruedas = new Rueda[]{ new Rueda(), new Rueda(), new Rueda(), new Rueda() };
        this.puertas = new Puerta[]{ new Puerta(), new Puerta() };
    }

    public void arrancarMotor() {
        motor.arrancar();
    }

    public void apagarMotor() {
        motor.apagar();
    }

    public void inflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.inflar();
        }
    }

    public void desinflarRuedas() {
        for (Rueda rueda : ruedas) {
            rueda.desinflar();
        }
    }

    public void abrirPuertas() {
        for (Puerta puerta : puertas) {
            puerta.abrirPuerta();
        }
    }

    public void cerrarPuertas() {
        for (Puerta puerta : puertas) {
            puerta.cerrarPuerta();
        }
    }

    public void abrirVentanas() {
        for (Puerta puerta : puertas) {
            puerta.abrirVentana();
        }
    }

    public void cerrarVentanas() {
        for (Puerta puerta : puertas) {
            puerta.cerrarVentana();
        }
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Puerta[] getPuertas() {
        return puertas;
    }

    public void setPuertas(Puerta[] puertas) {
        this.puertas = puertas;
    }
}