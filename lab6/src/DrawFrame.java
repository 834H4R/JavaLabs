import javax.swing.*;
import java.awt.*;

public class DrawFrame extends JFrame {
    private JPanel mainPanel;

    @Override
    public void paint(Graphics g){
        super.paint(g);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawFrame");
        frame.setContentPane(new DrawFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(800,700);
        frame.setVisible(true);
    }

}
