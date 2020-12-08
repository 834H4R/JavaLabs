import javax.swing.*;
import javax.xml.stream.events.EndDocument;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;

public class AddPersonFrame {
    public JPanel mainPanel;
    private JLabel lbSurname;
    private JLabel lbName;
    private JLabel lbBirthDate;
    private JLabel lbHeight;
    private JLabel lbWeight;
    private JButton btnConfirm;
    private JTextField tfSurname;
    private JTextField tfName;
    private JTextField tfYear;
    private JTextField tfMonth;
    private JTextField tfDay;
    private JTextField tfHeight;
    private JTextField tfWeight;
    private JButton btnWrite;
    private JButton btnClear;
    private JTextArea inputArea;
    private JButton btnRead;
    private JButton btnTask2;
    public static ArrayList<Person> pList = new ArrayList<>();
    public AddPersonFrame() {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Person p = new Person(tfSurname.getText(),tfName.getText(),Integer.parseInt(tfYear.getText()),
                        Integer.parseInt(tfMonth.getText()),Integer.parseInt(tfDay.getText()),Double.parseDouble(tfHeight.getText()),
                        Double.parseDouble(tfWeight.getText()));
                pList.add(p);
                JOptionPane.showMessageDialog(null,"Створено!");
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pList.clear();
                JOptionPane.showMessageDialog(null,"Очищено!");
            }
        });
        btnWrite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnWrite.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("Person.bin"))){
                        for(int i =0;i<pList.size();i++) {
                            dos.writeUTF(pList.get(i).get_surname());
                            dos.writeUTF(pList.get(i).get_name());
                            dos.writeUTF(pList.get(i).birthDateToString());
                            dos.writeDouble(pList.get(i).get_height());
                            dos.writeDouble(pList.get(i).get_weight());
                        }
                    }
                    catch (IOException ex){
                        inputArea.append(ex.getMessage());
                    }
                JOptionPane.showMessageDialog(null,"Записано!");
            }
        });
        btnRead.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try(DataInputStream dis = new DataInputStream(new FileInputStream("Person.bin"))) {
                    for(int i =0;i< pList.size();i++){
                        String Surname = dis.readUTF();
                        String Name = dis.readUTF();
                        String Birthdate = dis.readUTF();
                        double height = dis.readDouble();
                        double weight = dis.readDouble();
                        inputArea.append(Surname + "\t");
                        inputArea.append(Name + "\t");
                        inputArea.append(Birthdate + "\t");
                        inputArea.append(String.valueOf(height) + "\t");
                        inputArea.append(String.valueOf(weight) + "\t");
                        inputArea.append("\n");
                    }
                }
                catch (IOException ex){
                    inputArea.append(ex.getMessage());
                }
            }
        });
        btnTask2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame t2Frame = new JFrame("Task 2");
                t2Frame.setContentPane(new Task2Frame().mainPanel);
                t2Frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                t2Frame.pack();
                t2Frame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AddPersonFrame");
        frame.setContentPane(new AddPersonFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
