import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private static Coche coche = new Coche();
    private static JPanel carPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Control del Coche");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(4, 2));

        JButton arrancarMotorButton = new JButton("Arrancar Motor");
        JButton apagarMotorButton = new JButton("Apagar Motor");
        JButton inflarRuedasButton = new JButton("Inflar Ruedas");
        JButton desinflarRuedasButton = new JButton("Desinflar Ruedas");
        JButton abrirPuertasButton = new JButton("Abrir Puertas");
        JButton cerrarPuertasButton = new JButton("Cerrar Puertas");
        JButton cambiarRuedaButton = new JButton("Cambiar Rueda");
        JButton cambiarLlantaButton = new JButton("Cambiar Llanta");

        arrancarMotorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.arrancarMotor();
                carPanel.repaint();
            }
        });

        apagarMotorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.apagarMotor();
                carPanel.repaint();
            }
        });

        inflarRuedasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.inflarRuedas();
                carPanel.repaint();
            }
        });

        desinflarRuedasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.desinflarRuedas();
                carPanel.repaint();
            }
        });

        abrirPuertasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.abrirPuertas();
                carPanel.repaint();
            }
        });

        cerrarPuertasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.cerrarPuertas();
                carPanel.repaint();
            }
        });

        cambiarRuedaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.getRuedas()[0].cambiar(); // Cambia la primera rueda como ejemplo
                carPanel.repaint();
            }
        });

        cambiarLlantaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.getRuedas()[0].cambiarLlanta(); // Cambia la llanta de la primera rueda como ejemplo
                carPanel.repaint();
            }
        });

        controlPanel.add(arrancarMotorButton);
        controlPanel.add(apagarMotorButton);
        controlPanel.add(inflarRuedasButton);
        controlPanel.add(desinflarRuedasButton);
        controlPanel.add(abrirPuertasButton);
        controlPanel.add(cerrarPuertasButton);
        controlPanel.add(cambiarRuedaButton);
        controlPanel.add(cambiarLlantaButton);

        frame.add(controlPanel, BorderLayout.WEST);

        // Panel para representar el coche
        carPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Dibujar el coche
                g.setColor(Color.BLUE);
                g.fillRect(100, 100, 200, 100); // Cuerpo del coche

                // Dibujar las ruedas
                g.setColor(coche.getRuedas()[0].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(110, 190, 50, 50); // Rueda delantera izquierda
                g.setColor(coche.getRuedas()[1].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(240, 190, 50, 50); // Rueda delantera derecha
                g.setColor(coche.getRuedas()[2].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(110, 60, 50, 50); // Rueda trasera izquierda
                g.setColor(coche.getRuedas()[3].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(240, 60, 50, 50); // Rueda trasera derecha

                // Dibujar las puertas
                g.setColor(coche.getPuertas()[0].isAbierta() ? Color.GREEN : Color.GRAY);
                g.fillRect(100, 100, 20, 100); // Puerta izquierda
                g.setColor(coche.getPuertas()[1].isAbierta() ? Color.GREEN : Color.GRAY);
                g.fillRect(280, 100, 20, 100); // Puerta derecha
            }
        };

        frame.add(carPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}