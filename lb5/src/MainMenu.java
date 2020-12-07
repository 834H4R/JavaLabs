import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMenu extends JFrame {
    private JButton btnInfo;
    private JPanel panel1;
    private JButton btnPerson;
    private JButton btnStudent;
    private JButton btnTeacher;
    private JButton btnDirector;
    private JButton btnShowTable;
    private JButton btnShowPersons;

    public static ArrayList<Person> pList = new ArrayList<>();
    public static ArrayList<Teacher> tList = new ArrayList<>();
    public static ArrayList<Director> dList = new ArrayList<>();
    public static ArrayList<Student> sList = new ArrayList<>();

    public MainMenu() {
        btnInfo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInternalMessageDialog(null,"Маємо ієрархію класів Людина -> (Вчитель, учень)  Вчитель -" +
                        ">Керівник. \nКласс людина має такі поля: Прізвище, Ім'я, Стать, Номер телефону, Адресса" +
                        "\nКласс Вчитель додатково має поля Предмет, Категорія, Оклад, Нагороди" +
                        "\nКласс Керівник, окрім полів классу Людина та Вчитель має поля Посада, Години прийому" +
                        "\nКласс Учень, окрім полів классу Людина має поля Класс, Олімпіади, Неолюблений предмет");
            }
        });
        btnPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JFrame pFrame = new JFrame("Створення об'єкту людина");
               pFrame.setContentPane(new PersonAddFrame().mainPanel);
               pFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
               pFrame.pack();
               pFrame.setVisible(true);
               JOptionPane.showMessageDialog(null,"Всі поля класу є текстовими");
            }
        });
        btnTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tFrame = new JFrame("Створення об'єкту вчитель");
                tFrame.setContentPane(new TeacherAddFrame().mainPanel);
                tFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                tFrame.pack();
                tFrame.setVisible(true);
                JOptionPane.showMessageDialog(null,"При заповненні нагород, розділяти " +
                        "їх комою!!!\n Всі поля є текстовими, открім окладу.");
            }
        });
        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame sFrame = new JFrame("Створення об'єкту учень");
                sFrame.setContentPane(new StudentAddFrame().mainPanel);
                sFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                sFrame.pack();
                sFrame.setVisible(true);
                JOptionPane.showMessageDialog(null,"Олімпіади заповнювати так: кожна нова олімпіада " +
                        "відмежовується від попередньої крапкою з комою\n" +
                        "дані однієї олімпіади відмежовуються комою");
            }
        });
        btnDirector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame dFrame = new JFrame("Створення об'єкту керівник");
                dFrame.setContentPane(new DirectorAddFrame().mainPanel);
                dFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                dFrame.pack();
                dFrame.setVisible(true);
                JOptionPane.showMessageDialog(null,"При заповненні нагород, розділяти " +
                        "їх комою!!!\n Всі поля є текстовими, открім окладу.");
            }

        });
        btnShowTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tableFrame = new JFrame("Таблиця");
                tableFrame.setContentPane(new TableFrame().panel1);
                tableFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                tableFrame.pack();
                tableFrame.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainMenu");
        frame.setContentPane(new MainMenu().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
