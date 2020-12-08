import java.util.Arrays;
import java.util.Random;
import  java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rn = new Random(System.currentTimeMillis());
    public static void main(String[] args) {
        Task1();
        Task2();
    }
    public static void Task1()
    {
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        int indMax = 0;
        Double[] arr = new Double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Double(rn.nextDouble() * 100);
            if(arr[i] > arr[indMax]){
                indMax = i;
            }
        }
        Double[] arr2 = new Double[n];
        System.arraycopy(arr,0,arr2,0,n);


        for (int i = indMax; i < arr.length-1; i++) {
            Double tmp = arr[i+1];
            arr[i+1] = new Double(0);
            arr[i] = tmp;
        }

        for(int i =0;i< arr.length;i++){
            System.out.println(arr2[i] + "\t" + arr[i]);
        }
    }
    public static void Task2(){
        System.out.print("Введите n: ");
        int n = in.nextInt();
        System.out.print("Введите m: ");
        int m = in.nextInt();

        Double[][] arr = new Double[n][m];
        Integer[] minInd = new Integer[n];
        Arrays.fill(minInd,0);
        for(int i =0;i<n;i++){
            for (int j = 0; j < m; j++) {
                arr[i][j] = new Double(rn.nextDouble() * 100);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("=======================");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] < arr[i][minInd[i]]){
                    minInd[i] = j;
                }
            }
            Double tmp = new Double(arr[i][m-1]);
            arr[i][m-1] = arr[i][minInd[i]];
            arr[i][minInd[i]] = tmp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
