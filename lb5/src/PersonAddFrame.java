import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonAddFrame extends JFrame{
    public JPanel mainPanel;
    public JLabel lbSurname;
    public JLabel lbName;
    public JLabel lbSex;
    public JLabel lbPhone;
    public JLabel lbAddress;
    public JTextField tfSurname;
    public JTextField tfName;
    public JTextField tfSex;
    public JTextField tfPhone;
    public JTextField tfAddress;
    public JButton btnOk;

    public PersonAddFrame()  {

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Person(tfSurname.getText(), tfName.getText(), tfSex.getText(), tfPhone.getText(), tfAddress.getText());
                MainMenu.pList.add(p);
                JOptionPane.showMessageDialog(null,"Успішно створено");
            }
        });

    }
}
