import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateMeasuringDeviceFrame {
    private JLabel lbName;
    private JLabel lbHeight;
    private JLabel lbWidth;
    private JLabel lbWeight;
    private JLabel lbScaleStep;
    private JLabel lbMaxValue;
    private JLabel lbValueType;
    private JTextField tfName;
    private JTextField tfHeight;
    private JTextField tfWidth;
    private JTextField tfWeight;
    private JTextField tfScaleStep;
    private JTextField tfMaxValue;
    private JTextField tfValueType;
    private JButton btnConfirm;
    public JPanel mainPanel;

    public CreateMeasuringDeviceFrame() {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MeasuringDevice m = new MeasuringDevice(tfName.getText(), Double.parseDouble(tfHeight.getText()),
                        Double.parseDouble(tfWidth.getText()),Double.parseDouble(tfWeight.getText()),
                        Double.parseDouble(tfScaleStep.getText()),Double.parseDouble(tfMaxValue.getText()),
                        tfValueType.getText());
                MainMenuFrame.mList.add(m);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });
    }
}
