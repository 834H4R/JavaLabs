import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateBinocularusFrame {
    private JLabel lbName;
    private JLabel lbHeight;
    private JLabel lbWidth;
    private JLabel lbWeight;
    private JTextField tfName;
    private JTextField tfHeight;
    private JTextField tfWidth;
    private JButton btnConfirm;
    private JTextField tfWeight;
    private JLabel lbDistance;
    private JTextField tfDistance;
    private JLabel lbZoom;
    private JTextField tfZoom;
    public JPanel mainPanel;

    public CreateBinocularusFrame() {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Binoculars b = new Binoculars(tfName.getText(),Double.parseDouble(tfHeight.getText()),
                        Double.parseDouble(tfWidth.getText()), Double.parseDouble(tfWeight.getText()),
                        Integer.parseInt(tfDistance.getText()),Double.parseDouble(tfZoom.getText()));
                MainMenuFrame.oList.add(b);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });
    }
}
