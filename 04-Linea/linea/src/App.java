// Importaciones necesarias para la interfaz gráfica y eventos
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Clase principal que extiende JPanel para crear una interfaz gráfica personalizada
public class App extends JPanel {
    // Atributo que almacena la línea que se dibujará
    private Linea linea;

    /**
     * Constructor de la clase App
     * Inicializa la línea con dos puntos predeterminados
     */
    public App() {
        // Crea dos puntos para definir la línea inicial
        Punto punto1 = new Punto(50, 50);
        Punto punto2 = new Punto(150, 150);
        // Crea la línea con los puntos definidos
        linea = new Linea(punto1, punto2);
    }

    /**
     * Método sobrescrito que se encarga de dibujar los componentes gráficos
     * @param g Contexto gráfico donde se dibuja
     */
    @Override
    protected void paintComponent(Graphics g) {
        // Llama al método de la clase padre
        super.paintComponent(g);

        // Dibuja la cuadrícula del plano cartesiano
        g.setColor(Color.LIGHT_GRAY);
        // Dibuja líneas verticales cada 20 píxeles
        for (int i = 0; i <= getWidth(); i += 20) {
            g.drawLine(i, 0, i, getHeight());
        }
        // Dibuja líneas horizontales cada 20 píxeles
        for (int i = 0; i <= getHeight(); i += 20) {
            g.drawLine(0, i, getWidth(), i);
        }

        // Dibuja los ejes principales en negro
        g.setColor(Color.BLACK);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight()); // Eje Y
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2); // Eje X

        // Dibuja la línea en rojo
        g.setColor(Color.RED);
        g.drawLine((int) linea.getPuntoA().getX(), (int) linea.getPuntoA().getY(),
                  (int) linea.getPuntoB().getX(), (int) linea.getPuntoB().getY());

        // Dibuja los puntos extremos como círculos
        g.fillOval((int) linea.getPuntoA().getX() - 3, (int) linea.getPuntoA().getY() - 3, 6, 6);
        g.fillOval((int) linea.getPuntoB().getX() - 3, (int) linea.getPuntoB().getY() - 3, 6, 6);

        // Muestra las coordenadas de los puntos
        g.drawString("(" + linea.getPuntoA().getX() + ", " + linea.getPuntoA().getY() + ")",
                    (int) linea.getPuntoA().getX() + 5, (int) linea.getPuntoA().getY() - 5);
        g.drawString("(" + linea.getPuntoB().getX() + ", " + linea.getPuntoB().getY() + ")",
                    (int) linea.getPuntoB().getX() + 5, (int) linea.getPuntoB().getY() - 5);
    }

    /**
     * Método principal que inicia la aplicación
     */
    public static void main(String[] args) {
        // Crea la ventana principal
        JFrame frame = new JFrame("Linea en JFrame");
        App panel = new App();

        // Añade el panel principal al centro
        frame.add(panel, BorderLayout.CENTER);

        // Crea y configura el panel de botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3));

        // Crea los botones de dirección
        JButton upButton = new JButton("↑");
        JButton downButton = new JButton("↓");
        JButton leftButton = new JButton("←");
        JButton rightButton = new JButton("→");

        // Organiza los botones en el panel
        buttonPanel.add(new JLabel()); // Espacio vacío
        buttonPanel.add(upButton);
        buttonPanel.add(new JLabel()); // Espacio vacío
        buttonPanel.add(leftButton);
        buttonPanel.add(downButton);
        buttonPanel.add(rightButton);

        // Añade el panel de botones en la parte inferior
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Configura los eventos de los botones
        // Botón Arriba
        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveArriba(10);
                panel.repaint();
            }
        });

        // Botón Abajo
        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveAbajo(10);
                panel.repaint();
            }
        });

        // Botón Izquierda
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveIzquierda(10);
                panel.repaint();
            }
        });

        // Botón Derecha
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveDerecha(10);
                panel.repaint();
            }
        });

        // Configura la ventana principal
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}