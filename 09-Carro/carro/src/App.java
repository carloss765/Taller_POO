import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase principal que implementa una interfaz gráfica para controlar un coche.
 * Permite interactuar con diferentes componentes del coche como el motor,
 * las ruedas y las puertas a través de botones y una representación visual.
 */
public class App {
    // Instancia del coche que será controlado
    private static Coche coche = new Coche();
    // Panel donde se dibujará la representación visual del coche
    private static JPanel carPanel;

    /**
     * Método principal que inicializa y configura la interfaz gráfica.
     * @param args argumentos de línea de comando (no utilizados)
     */
    public static void main(String[] args) {
        // Configuración de la ventana principal
        JFrame frame = new JFrame("Control del Coche");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new BorderLayout());

        // Panel de control con botones
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(4, 2));

        // Creación de botones para las diferentes acciones
        JButton arrancarMotorButton = new JButton("Arrancar Motor");
        JButton apagarMotorButton = new JButton("Apagar Motor");
        JButton inflarRuedasButton = new JButton("Inflar Ruedas");
        JButton desinflarRuedasButton = new JButton("Desinflar Ruedas");
        JButton abrirPuertasButton = new JButton("Abrir Puertas");
        JButton cerrarPuertasButton = new JButton("Cerrar Puertas");
        JButton cambiarRuedaButton = new JButton("Cambiar Rueda");
        JButton cambiarLlantaButton = new JButton("Cambiar Llanta");

        // Configuración de los listeners para cada botón
        // Arrancar motor
        arrancarMotorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.arrancarMotor();
                carPanel.repaint(); // Actualiza la visualización
            }
        });

        // Apagar motor
        apagarMotorButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.apagarMotor();
                carPanel.repaint();
            }
        });

        // Inflar ruedas
        inflarRuedasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.inflarRuedas();
                carPanel.repaint();
            }
        });

        // Desinflar ruedas
        desinflarRuedasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.desinflarRuedas();
                carPanel.repaint();
            }
        });

        // Abrir puertas
        abrirPuertasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.abrirPuertas();
                carPanel.repaint();
            }
        });

        // Cerrar puertas
        cerrarPuertasButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.cerrarPuertas();
                carPanel.repaint();
            }
        });

        // Cambiar rueda (primera rueda como ejemplo)
        cambiarRuedaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.getRuedas()[0].cambiar();
                carPanel.repaint();
            }
        });

        // Cambiar llanta (primera rueda como ejemplo)
        cambiarLlantaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                coche.getRuedas()[0].cambiarLlanta();
                carPanel.repaint();
            }
        });

        // Añadir todos los botones al panel de control
        controlPanel.add(arrancarMotorButton);
        controlPanel.add(apagarMotorButton);
        controlPanel.add(inflarRuedasButton);
        controlPanel.add(desinflarRuedasButton);
        controlPanel.add(abrirPuertasButton);
        controlPanel.add(cerrarPuertasButton);
        controlPanel.add(cambiarRuedaButton);
        controlPanel.add(cambiarLlantaButton);

        // Añadir el panel de control a la izquierda de la ventana
        frame.add(controlPanel, BorderLayout.WEST);

        // Crear el panel para la representación visual del coche
        carPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                // Dibujar el cuerpo del coche
                g.setColor(Color.BLUE);
                g.fillRect(100, 100, 200, 100);

                // Dibujar las ruedas (negras si están infladas, rojas si están desinfladas)
                g.setColor(coche.getRuedas()[0].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(110, 190, 50, 50); // Rueda delantera izquierda
                g.setColor(coche.getRuedas()[1].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(240, 190, 50, 50); // Rueda delantera derecha
                g.setColor(coche.getRuedas()[2].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(110, 60, 50, 50);  // Rueda trasera izquierda
                g.setColor(coche.getRuedas()[3].isInflada() ? Color.BLACK : Color.RED);
                g.fillOval(240, 60, 50, 50);  // Rueda trasera derecha

                // Dibujar las puertas (verdes si están abiertas, grises si están cerradas)
                g.setColor(coche.getPuertas()[0].isAbierta() ? Color.GREEN : Color.GRAY);
                g.fillRect(100, 100, 20, 100); // Puerta izquierda
                g.setColor(coche.getPuertas()[1].isAbierta() ? Color.GREEN : Color.GRAY);
                g.fillRect(280, 100, 20, 100); // Puerta derecha
            }
        };

        // Añadir el panel del coche al centro de la ventana
        frame.add(carPanel, BorderLayout.CENTER);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}
