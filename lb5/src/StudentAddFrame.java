import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentAddFrame {
    public JPanel mainPanel;
    public JLabel lbSurname;
    public JLabel lbName;
    public JLabel lbSex;
    public JLabel lbPhone;
    public JLabel lbAddress;
    public JLabel lbGrade;
    public JLabel lbOlympiads;
    public JLabel lbUnfavoriteLesson;
    public JTextField tfSurname;
    public JTextField tfName;
    public JTextField tfSex;
    public JTextField tfPhone;
    public JTextField tfAddress;
    public JTextField tfGrade;
    public JTextField tfOlymp;
    public JTextField tfUnf;
    public JButton btnOk;

    public StudentAddFrame() {
        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Student s = new Student(tfSurname.getText(), tfName.getText(), tfSex.getText(), tfPhone.getText(), tfAddress.getText(),tfGrade.getText(),Olympiad.GetOlympiads(tfOlymp.getText()),tfUnf.getText());
                MainMenu.sList.add(s);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });
    }
}
