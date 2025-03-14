// Importamos la biblioteca Swing de Java para crear la interfaz gráfica
import javax.swing.*;

// Clase principal que hereda de JPanel para crear una ventana gráfica
public class App extends JPanel {
    // Método principal que inicia la aplicación
    public static void main(String[] args) throws Exception {
        // Creamos una nueva ventana con el título "Rectangulo"
        JFrame frame = new JFrame("Rectangulo");

        // Creamos un nuevo rectángulo con:
        // - Posición inicial (x,y): (50,50)
        // - Ancho: 150 (200-50)
        // - Alto: 100 (150-50)
        Rectangulo rectangulo = new Rectangulo(50, 50, 200, 150);

        // Creamos un panel personalizado que dibujará el rectángulo
        PanelRectangulo panel = new PanelRectangulo(rectangulo);

        // Añadimos el panel a la ventana principal
        frame.add(panel);

        // Establecemos el tamaño de la ventana en 400x400 píxeles
        frame.setSize(400, 400);

        // Configuramos que la aplicación se cierre al presionar el botón X
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Hacemos visible la ventana
        frame.setVisible(true);
    }
}