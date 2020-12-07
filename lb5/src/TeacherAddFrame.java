import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeacherAddFrame {
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

    public TeacherAddFrame() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Teacher t = new Teacher(tfSurname.getText(), tfName.getText(), tfSex.getText(), tfPhone.getText(), tfAddress.getText(),tfLesson.getText(),tfCategory.getText(),Double.valueOf(tfSallary.getText()),tfAwards.getText().split(","));
                MainMenu.tList.add(t);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });
    }
}
