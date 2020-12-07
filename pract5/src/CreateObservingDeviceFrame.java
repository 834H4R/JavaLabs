import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateObservingDeviceFrame {
    private JLabel lbName;
    private JLabel lbHeight;
    private JLabel lbWidth;
    private JLabel lbWeight;
    private JTextField tfName;
    private JTextField tfHeight;
    private JTextField tfWidth;
    private JTextField tfWeight;
    private JButton btnConfirm;
    private JLabel lbDistance;
    private JTextField tfDistance;
    public JPanel mainPanel;

    public CreateObservingDeviceFrame() {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ObservingDevice o = new ObservingDevice(tfName.getText(),Double.parseDouble(tfHeight.getText()),
                        Double.parseDouble(tfWidth.getText()), Double.parseDouble(tfWeight.getText()),
                        Integer.parseInt(tfDistance.getText()));
                MainMenuFrame.oList.add(o);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });
    }
}
