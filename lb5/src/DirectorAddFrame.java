import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DirectorAddFrame {
    public JPanel mainPanel;
    public JLabel lbSurname;
    public JLabel lbName;
    public JLabel lbSex;
    public JLabel lbPhone;
    public JLabel lbAddress;
    public JLabel lbLesson;
    public JLabel lbCategory;
    public JLabel lbSallary;
    public JLabel lbAwards;
    public JTextField tfSurname;
    public JTextField tfName;
    public JTextField tfSex;
    public JTextField tfPhone;
    public JTextField tfAddress;
    public JTextField tfLesson;
    public JTextField tfCategory;
    public JTextField tfSallary;
    public JTextField tfAwards;
    public JButton btnOk;
    public JLabel lbPosition;
    public JTextField tfPosition;

    public DirectorAddFrame() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Director d = new Director(tfSurname.getText(), tfName.getText(), tfSex.getText(), tfPhone.getText(), tfAddress.getText(), tfLesson.getText(),tfCategory.getText(),Double.valueOf(tfSallary.getText()),tfAwards.getText().split(","),tfPosition.getText());
            }
        });
    }
}
