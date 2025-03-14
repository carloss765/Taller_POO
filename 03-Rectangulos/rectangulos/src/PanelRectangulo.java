// Importamos las bibliotecas necesarias de Swing para la interfaz gráfica
import javax.swing.*;
// Importamos las bibliotecas de AWT para el manejo de gráficos
import java.awt.*;

// Clase PanelRectangulo que hereda de JPanel para crear un panel personalizado
public class PanelRectangulo extends JPanel {

    // Declaramos una variable privada para almacenar el rectángulo que vamos a dibujar
    private Rectangulo rectangulo;

    /**
     * Constructor del panel que recibe un rectángulo como parámetro
     * @param rectangulo El rectángulo que se va a dibujar en el panel
     */
    public PanelRectangulo(Rectangulo rectangulo) {
        // Guardamos la referencia al rectángulo recibido
        this.rectangulo = rectangulo;
    }

    /**
     * Método sobrescrito de JPanel que se encarga de dibujar el componente
     * @param g Objeto Graphics que proporciona el contexto gráfico para dibujar
     */
    @Override
    protected void paintComponent(Graphics g) {
        // Llamamos al método de la clase padre para mantener el comportamiento básico
        super.paintComponent(g);
        // Establecemos el color azul para el rectángulo
        g.setColor(Color.BLUE);
        // Dibujamos el rectángulo relleno usando los valores del objeto Rectangulo:
        // - getX() y getY() para la posición
        // - getAncho() y getAlto() para las dimensiones
        g.fillRect(rectangulo.getX(), rectangulo.getY(), rectangulo.getAncho(), rectangulo.getAlto());
    }
}