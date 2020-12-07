import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainMenuFrame {
    private JPanel mainPanel;
    private JButton btnCreateDevice;
    private JButton btnCreateMeasuringDevice;
    private JButton btnCreateObservingDevice;
    private JButton btnCreateBinocularus;
    private JButton btnShowTable;
    public static ArrayList<Device> dList = new ArrayList<>();
    public static ArrayList<MeasuringDevice> mList = new ArrayList<>();
    public static ArrayList<ObservingDevice> oList = new ArrayList<>();
    public static ArrayList<Binoculars> bList = new ArrayList<>();

    public MainMenuFrame() {
        btnCreateDevice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Dframe = new JFrame("Create Device");
                Dframe.setContentPane(new CreateDeviceFrame().mainPanel);
                Dframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Dframe.pack();
                Dframe.setVisible(true);
            }
        });
        btnCreateMeasuringDevice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Mframe = new JFrame("Create Measuring Device");
                Mframe.setContentPane(new CreateMeasuringDeviceFrame().mainPanel);
                Mframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Mframe.pack();
                Mframe.setVisible(true);
            }
        });
        btnCreateObservingDevice.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Oframe = new JFrame("Create Observing Device");
                Oframe.setContentPane(new CreateObservingDeviceFrame().mainPanel);
                Oframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Oframe.pack();
                Oframe.setVisible(true);
            }
        });
        btnCreateBinocularus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Bframe = new JFrame("Create Binocularus");
                Bframe.setContentPane(new CreateBinocularusFrame().mainPanel);
                Bframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Bframe.pack();
                Bframe.setVisible(true);
            }
        });
        btnShowTable.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame Tframe = new JFrame("Table");
                Tframe.setContentPane(new MainTable().mainPanel);
                Tframe.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                Tframe.pack();
                Tframe.setVisible(true);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MainMenuFrame");
        frame.setContentPane(new MainMenuFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
