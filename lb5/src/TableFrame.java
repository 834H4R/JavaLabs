import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class TableFrame {
    public  JTable table1;
    public JPanel panel1;
    private JButton btnPerson;
    private JButton btnStudent;
    private JButton btnTeacher;
    private JButton btnDirector;

    public TableFrame() {

        btnPerson.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String[][] info = new String[MainMenu.pList.size()][5];
                for(int i =0;i<MainMenu.pList.size();i++){
                    info[i][0] = MainMenu.pList.get(i)._surname;
                    info[i][1] = MainMenu.pList.get(i)._name;
                    info[i][2] = MainMenu.pList.get(i)._sex;
                    info[i][3] = MainMenu.pList.get(i)._phoneNumber;
                    info[i][4] = MainMenu.pList.get(i)._address;
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Прізвище");
                model.addColumn("Ім'я");
                model.addColumn("Стать");
                model.addColumn("Телефон");
                model.addColumn("Адреса");
                for(int i =0;i<MainMenu.pList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
        btnStudent.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenu.sList.size()][8];
                for(int i =0;i<MainMenu.sList.size();i++){
                    info[i][0] = MainMenu.sList.get(i)._surname;
                    info[i][1] = MainMenu.sList.get(i)._name;
                    info[i][2] = MainMenu.sList.get(i)._sex;
                    info[i][3] = MainMenu.sList.get(i)._phoneNumber;
                    info[i][4] = MainMenu.sList.get(i)._address;
                    info[i][5] = MainMenu.sList.get(i)._grade;
                    StringBuilder sb = new StringBuilder();
                    for(int j = 0;j < MainMenu.sList.get(i).olympiads.size();j++ ){
                        sb.append(MainMenu.sList.get(i).olympiads.get(j).toString());
                    }
                    info[i][6] = sb.toString();
                    info[i][7] = MainMenu.sList.get(i)._unfavoriteLesson;
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Прізвище");
                model.addColumn("Ім'я");
                model.addColumn("Стать");
                model.addColumn("Телефон");
                model.addColumn("Адреса");
                model.addColumn("Клас");
                model.addColumn("Олімпіади");
                model.addColumn("Неолюблений предмет");
                for(int i =0;i<MainMenu.sList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
        btnTeacher.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenu.tList.size()][9];
                for(int i =0;i<MainMenu.tList.size();i++){
                    info[i][0] = MainMenu.tList.get(i)._surname;
                    info[i][1] = MainMenu.tList.get(i)._name;
                    info[i][2] = MainMenu.tList.get(i)._sex;
                    info[i][3] = MainMenu.tList.get(i)._phoneNumber;
                    info[i][4] = MainMenu.tList.get(i)._address;
                    info[i][5] = MainMenu.tList.get(i)._lesson;
                    info[i][6] = MainMenu.tList.get(i)._category;
                    info[i][7] = String.valueOf(MainMenu.tList.get(i)._salary);
                    info[i][8] = MainMenu.tList.get(i).awardsToStr();
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Прізвище");
                model.addColumn("Ім'я");
                model.addColumn("Стать");
                model.addColumn("Телефон");
                model.addColumn("Адреса");
                model.addColumn("Предмет");
                model.addColumn("Категорія");
                model.addColumn("Оклад");
                model.addColumn("Нагороди");
                for(int i =0;i<MainMenu.tList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
        btnDirector.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenu.dList.size()][10];
                for(int i =0;i<MainMenu.dList.size();i++){
                    info[i][0] = MainMenu.dList.get(i)._surname;
                    info[i][1] = MainMenu.dList.get(i)._name;
                    info[i][2] = MainMenu.dList.get(i)._sex;
                    info[i][3] = MainMenu.dList.get(i)._phoneNumber;
                    info[i][4] = MainMenu.dList.get(i)._address;
                    info[i][5] = MainMenu.dList.get(i)._lesson;
                    info[i][6] = MainMenu.dList.get(i)._category;
                    info[i][7] = String.valueOf(MainMenu.dList.get(i)._salary);
                    info[i][8] = MainMenu.dList.get(i).awardsToStr();
                    info[i][9] = MainMenu.dList.get(i)._position;
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Прізвище");
                model.addColumn("Ім'я");
                model.addColumn("Стать");
                model.addColumn("Телефон");
                model.addColumn("Адреса");
                model.addColumn("Предмет");
                model.addColumn("Категорія");
                model.addColumn("Оклад");
                model.addColumn("Нагороди");
                model.addColumn("Посада");
                for(int i =0;i<MainMenu.tList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
    }
}
