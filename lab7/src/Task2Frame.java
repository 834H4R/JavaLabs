import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Random;

public class Task2Frame {
    public JPanel mainPanel;
    private JLabel lbM;
    private JLabel lbN;
    private JTextField tfM;
    private JTextField tfN;
    private JTextArea textArea1;
    private JButton btnConfirm;

    public Task2Frame() {
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random r = new Random(System.currentTimeMillis());
                int m = Integer.parseInt(tfM.getText());
                int n = Integer.parseInt(tfN.getText());
                int[][] Matrix = new int[m][n];
                textArea1.append("Матриця\n");

                for(int i =0;i<m;i++){
                    for(int j=0;j<n;j++){
                        Matrix[i][j] = r.nextInt();
                        textArea1.append(Matrix[i][j] + "\t");
                    }
                    textArea1.append("\n");
                }
                int max = Matrix[0][0];
                int MaxRow = 0;
                for(int i =0;i<m;i++){
                    for(int j=0;j<n;j++){
                        if(Matrix[i][j] > max){
                            max = Matrix[i][j];
                            MaxRow = i;
                        }
                    }
                }
                textArea1.append("\n\n\nРядок з максимальним елементом:\n");
                for(int i = 0;i<n;i++){
                    textArea1.append(Matrix[MaxRow][i] + "\t");
                }
                int sum = 0;
                for(int i =0;i<n;i++){
                    sum+= Matrix[1][i];
                }
                sum = sum / n;
                textArea1.append("\n\n\nСереднє арифметичне елементів другого рядка:\n"+sum);
                String StringMatrix = "";
                for(int i =0;i<m;i++){
                    for(int j =0;j<n;j++){
                        StringMatrix+= Matrix[i][j] + "\t";
                    }
                    StringMatrix+="\n";
                }
                String  mRowString = "";
                for(int i = 0;i<n;i++){
                    mRowString += Matrix[MaxRow][i] + "\t";
                }
                mRowString+= "\n";
                try{BufferedWriter writer = new BufferedWriter(new FileWriter("Matrix.txt"));
                    writer.write(StringMatrix);
                    writer.write("\n");
                    writer.write(mRowString);
                    writer.write("\n");
                    writer.write(String.valueOf(sum));
                    writer.close();
                }catch (IOException ex){
                    textArea1.append(ex.getMessage());
                }
            }

        });
    }
}
