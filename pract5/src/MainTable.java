import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainTable {
    private JTable table1;
    private JButton btnShowDevice;
    private JButton btnShowMeasuringDevice;
    private JButton btnShowObservingDevice;
    private JButton btnShowBinocularus;
    public JPanel mainPanel;

    public MainTable() {

        btnShowDevice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenuFrame.dList.size()][4];
                for(int i =0;i<MainMenuFrame.dList.size();i++){
                    info[i][0] = MainMenuFrame.dList.get(i).get_name();
                    info[i][1] = String.valueOf(MainMenuFrame.dList.get(i).getHeight());
                    info[i][2] = String.valueOf(MainMenuFrame.dList.get(i).getWidth());
                    info[i][3] = String.valueOf(MainMenuFrame.dList.get(i).getWeight());
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Назва");
                model.addColumn("Висота");
                model.addColumn("Ширина");
                model.addColumn("Вага");
                for(int i =0;i<MainMenuFrame.dList.size();i++){
                    model.addRow(info[i]);
                }
            }

        });
        btnShowMeasuringDevice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenuFrame.mList.size()][7];
                for(int i =0;i<MainMenuFrame.mList.size();i++){
                    info[i][0] = MainMenuFrame.mList.get(i).get_name();
                    info[i][1] = String.valueOf(MainMenuFrame.mList.get(i).getHeight());
                    info[i][2] = String.valueOf(MainMenuFrame.mList.get(i).getWidth());
                    info[i][3] = String.valueOf(MainMenuFrame.mList.get(i).getWeight());
                    info[i][4] = String.valueOf(MainMenuFrame.mList.get(i).get_scaleStep());
                    info[i][5] = String.valueOf(MainMenuFrame.mList.get(i).get_maxValue());
                    info[i][6] = MainMenuFrame.mList.get(i).get_valueType();
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Назва");
                model.addColumn("Висота");
                model.addColumn("Ширина");
                model.addColumn("Вага");
                model.addColumn("Крок шкали");
                model.addColumn("Максимальне значення");
                model.addColumn("Одиниця вимірювання");
                for(int i =0;i<MainMenuFrame.mList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
        btnShowObservingDevice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenuFrame.oList.size()][5];
                for(int i =0;i<MainMenuFrame.oList.size();i++){
                    info[i][0] = MainMenuFrame.dList.get(i).get_name();
                    info[i][1] = String.valueOf(MainMenuFrame.oList.get(i).getHeight());
                    info[i][2] = String.valueOf(MainMenuFrame.oList.get(i).getWidth());
                    info[i][3] = String.valueOf(MainMenuFrame.oList.get(i).getWeight());
                    info[i][4] = String.valueOf(MainMenuFrame.oList.get(i).get_distance());
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Назва");
                model.addColumn("Висота");
                model.addColumn("Ширина");
                model.addColumn("Вага");
                model.addColumn("Максимальна дистанція");
                for(int i =0;i<MainMenuFrame.oList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
        btnShowBinocularus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[][] info = new String[MainMenuFrame.bList.size()][6];
                for(int i =0;i<MainMenuFrame.bList.size();i++){
                    info[i][0] = MainMenuFrame.dList.get(i).get_name();
                    info[i][1] = String.valueOf(MainMenuFrame.bList.get(i).getHeight());
                    info[i][2] = String.valueOf(MainMenuFrame.bList.get(i).getWidth());
                    info[i][3] = String.valueOf(MainMenuFrame.bList.get(i).getWeight());
                    info[i][4] = String.valueOf(MainMenuFrame.bList.get(i).get_distance());
                    info[i][5] = String.valueOf(MainMenuFrame.bList.get(i).get_zoom());
                }
                DefaultTableModel model = (DefaultTableModel)table1.getModel();
                if(model.getRowCount() > 0){model.setRowCount(0);}
                if(model.getColumnCount()>0){model.setColumnCount(0);}
                model.addColumn("Назва");
                model.addColumn("Висота");
                model.addColumn("Ширина");
                model.addColumn("Вага");
                model.addColumn("Максимальна дистанція");
                model.addColumn("Максимальне наближення");
                for(int i =0;i<MainMenuFrame.bList.size();i++){
                    model.addRow(info[i]);
                }
            }
        });
    }
}
