import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Task1();
        Task2();
        System.out.print("Введите строку: ");
        int res = StringOperator.Task1(in.nextLine());
        System.out.println(res);
        System.out.print("Введите строку: ");
        ArrayList<String> polindroms = StringOperator.Task2(in.nextLine());
        for (String word:polindroms) {
            System.out.println(word);
        }
    }
    public static void Task1(){
        System.out.print("Введите строку: ");
        StringBuilder sb = new StringBuilder(in.nextLine());
        char first = sb.charAt(0);
        char last = sb.charAt(sb.length()-1);
        sb.setCharAt(0,last);
        sb.setCharAt(sb.length()-1,first);
        System.out.println(sb);
    }
    public static void Task2(){
        System.out.print("Введите строку: ");
        String[] words = in.nextLine().split(" ");
        String out = "";
        for (String word:words) {
            word+= word.length();
            out+= word + " ";
        }
        System.out.println(out);
    }
}
