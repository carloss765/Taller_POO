import javax.swing.*;

public class App extends JPanel {
    public static void main(String[] args) throws Exception {

        JFrame frame = new JFrame("Rectangulo");
        Rectangulo rectangulo = new Rectangulo(50, 50, 200, 150);
        PanelRectangulo panel = new PanelRectangulo(rectangulo);
        frame.add(panel);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
