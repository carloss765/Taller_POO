import javax.swing.*;
import java.awt.*;

public class PanelRectangulo extends JPanel {

    private Rectangulo rectangulo;

    public PanelRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(rectangulo.getX(), rectangulo.getY(), rectangulo.getAncho(), rectangulo.getAlto());
    }

}
