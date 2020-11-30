import java.util.Arrays;
import java.util.Random;
import  java.util.Scanner;
public class Main {
    static Scanner in = new Scanner(System.in); // сканер для введення даних
    static Random rn = new Random(System.currentTimeMillis()); // генератор випадкових чисел
    
    public static void main(String[] args) {
        Task1(); // виклики методів завдань
        Task2();
    }
    public static void Task1()
    {
        // необхідно в одновимірному масиві, після максимального елементу смістити всі числа вліво, а останнє зробити нулем
        // наприклад [1,7,9,11,23,4,25,18,3] => [1,7,9,11,23,4,18,3,0]
        System.out.print("Введите число n: "); // отримуємо довжину масиву
        int n = in.nextInt();
        int indMax = 0; // тут буде зберігатися індекс максимального елементу
        Double[] arr = new Double[n]; // оголошуємо масив типу классу-обгортки типу даних double
        for (int i = 0; i < n; i++) { // заповнюємо масив випадковими числами
            arr[i] = new Double(rn.nextDouble() * 100);
            if(arr[i] > arr[indMax]){ // одразу шукаємо максимальний елемент в масиві
                indMax = i;
            }
        }
        Double[] arr2 = new Double[n]; // оголошуємо копію масиву, він потрібен щоб показати оригінальний масив і видозмінений
        System.arraycopy(arr,0,arr2,0,n); // переносимо дані з першого масиву в другий


        for (int i = indMax; i < arr.length-1; i++) { // записуємо в позицію максимального елементу нуль
            Double tmp = arr[i+1];  // циклічно зміщуємо цей нуль вправо, тобто всі інші елементи змістяться вліво
            arr[i+1] = new Double(0); 
            arr[i] = tmp; // змінна tmp = тимчасове сховище для елементу наступної клітинки 
        }

        for(int i =0;i< arr.length;i++){ // виводимо обидва масива на екран, спочатку оригінал і через символ Tab - видозмінений
            System.out.println(arr2[i] + "\t" + arr[i]);
        }
    }
    public static void Task2(){ 
        // мамо матрицю n * m, потрібно в кожному рядку замінити мінімальний елемент та останній
        System.out.print("Введите n: "); // вводимо значення n
        int n = in.nextInt();
        System.out.print("Введите m: "); // та m
        int m = in.nextInt();

        Double[][] arr = new Double[n][m]; // Оголошуємо масив n * m класу обгортки типу даних Double
        Integer[] minInd = new Integer[n]; // в цьому масиві будуть міститися індекси мінімальних елементів кожного рядка
        Arrays.fill(minInd,0); // заповнюємо його нулями
        for(int i =0;i<n;i++){ // заповнюємо масив випадковими числами
            for (int j = 0; j < m; j++) {
                arr[i][j] = new Double(rn.nextDouble() * 100); 
                System.out.print(arr[i][j] + " "); // Та виводимо на екран
            }
            System.out.println();
        }
        System.out.println("======================="); // розділюєм оригінальний масив та видозмінений
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) { // проходимо по всім рядкам і стовбцям
                if(arr[i][j] < arr[i][minInd[i]]){ // якщо значення клітинки менше, ніж значення з масиву індексів мінімальних елементів
                    minInd[i] = j; // в масив індексів мінімальних елементів записуємо номер стовбця, де знаходиться ця клітинка
                } // таким чином у є одновимірний масив, на n елементів. Кожен елемент цього масиву показує нам, в якому стовбці знаходиться мінімальний елемент
            }
            Double tmp = new Double(arr[i][m-1]); // коли ми визначили черговий індекс мінімального елементу
            arr[i][m-1] = arr[i][minInd[i]]; // міняємо місцями останній елемент в рядку з мінімальний
            arr[i][minInd[i]] = tmp; 
        }
        for (int i = 0; i < n; i++) { // виводимо новий масив
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }



    }
}
