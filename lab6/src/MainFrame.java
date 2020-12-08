import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MainFrame {
    public JPanel mainPanel;
    public MainFrame() {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("ЛТЕУ");
        frame.setContentPane(new MainFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocation(150,350);
        frame.setSize(300,300);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              frame.setLocation(frame.getX()+5,frame.getY());
            }
        });

    }
}
