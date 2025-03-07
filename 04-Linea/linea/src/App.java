import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JPanel {
    private Linea linea;

    // se crea un objeto de la clase Linea
    public App() {
        Punto punto1 = new Punto(50, 50);
        Punto punto2 = new Punto(150, 150);
        linea = new Linea(punto1, punto2);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Dibujar el plano cartesiano
        g.setColor(Color.LIGHT_GRAY);
        for (int i = 0; i <= getWidth(); i += 20) {
            g.drawLine(i, 0, i, getHeight());
        }
        for (int i = 0; i <= getHeight(); i += 20) {
            g.drawLine(0, i, getWidth(), i);
        }
        // Ejes
        g.setColor(Color.BLACK);
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight()); // Eje Y
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2); // Eje X

        // Dibujar la línea
        g.setColor(Color.RED);
        g.drawLine((int) linea.getPuntoA().getX(), (int) linea.getPuntoA().getY(),
                (int) linea.getPuntoB().getX(), (int) linea.getPuntoB().getY());

        // Dibujar los puntos
        g.fillOval((int) linea.getPuntoA().getX() - 3, (int) linea.getPuntoA().getY() - 3, 6, 6);
        g.fillOval((int) linea.getPuntoB().getX() - 3, (int) linea.getPuntoB().getY() - 3, 6, 6);

        // Dibujar las coordenadas de los puntos
        g.drawString("(" + linea.getPuntoA().getX() + ", " + linea.getPuntoA().getY() + ")",
                (int) linea.getPuntoA().getX() + 5, (int) linea.getPuntoA().getY() - 5);
        g.drawString("(" + linea.getPuntoB().getX() + ", " + linea.getPuntoB().getY() + ")",
                (int) linea.getPuntoB().getX() + 5, (int) linea.getPuntoB().getY() - 5);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Linea en JFrame");
        App panel = new App();

        frame.add(panel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2, 3));

        // Botones de movimiento
        JButton upButton = new JButton("↑");
        JButton downButton = new JButton("↓");
        JButton leftButton = new JButton("←");
        JButton rightButton = new JButton("→");

        buttonPanel.add(new JLabel()); // Empty cell
        buttonPanel.add(upButton);
        buttonPanel.add(new JLabel()); // Empty cell
        buttonPanel.add(leftButton);
        buttonPanel.add(downButton);
        buttonPanel.add(rightButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);

        upButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveArriba(10);
                panel.repaint();
            }
        });

        downButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveAbajo(10);
                panel.repaint();
            }
        });

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveIzquierda(10);
                panel.repaint();
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.linea.mueveDerecha(10);
                panel.repaint();
            }
        });

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}