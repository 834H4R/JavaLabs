import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateDeviceFrame {
    private JLabel lbName;
    private JLabel lbHeight;
    private JLabel lbWidth;
    private JLabel lbWeight;
    private JTextField tfName;
    private JTextField tfHeight;
    private JTextField tfWidth;
    private JTextField tfWeight;
    private JButton btnConfirm;
    public JPanel mainPanel;

    public CreateDeviceFrame() {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Device d = new Device(tfName.getText(),Double.parseDouble(tfHeight.getText()),
                        Double.parseDouble(tfWidth.getText()), Double.parseDouble(tfWeight.getText()));
                MainMenuFrame.dList.add(d);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });
    }
}
