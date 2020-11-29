import java.util.Objects;
import java.util.Scanner;
public class Dyscyplina implements IInterface{

    public static Scanner in = new Scanner(System.in);

    private String _name;
    private int _lectCount;
    private int _labCount;
    private int _selfCount;

    public Dyscyplina(){}
    public Dyscyplina(String name, int lect, int lab, int self){
        this._name = name;
        this._lectCount = lect;
        this._labCount = lab;
        this._selfCount = self;
    }
    @Override
    public void input() {
        System.out.print("Введите название дисциплины: ");
        this._name =  in.nextLine();
        System.out.print("Введите количество лекционных часов: ");
        this._lectCount = in.nextInt();
        System.out.print("Введите количество лабораторных часов: ");
        this._labCount = in.nextInt();
        System.out.print("Введите количество часов на самостоятельную работу: ");
        this._selfCount = in.nextInt();
    }

    @Override
    public void output() {
        System.out.println("Названи дисциплины: " + this._name);
        System.out.println("Количество лекционных часов: " + this._lectCount);
        System.out.println("Количество лабораторных часов: " + this._labCount);
        System.out.println("Количество часов на самостоятельную работу: " + this._selfCount);
        method(117);
    }

    @Override
    public void method(double d) {
        System.out.println("Общее количество часов: " + (this._selfCount + this._labCount + this._lectCount));
    }

    @Override
    public String toString() {
        return ("Названи дисциплины: " + this._name + "\n" +
                "Количество лекционных часов: " + this._lectCount + "\n" +
                "Количество лабораторных часов: " + this._labCount + "\n" +
                "Количество часов на самостоятельную работу: " + this._selfCount + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dyscyplina that = (Dyscyplina) o;
        return _lectCount == that._lectCount &&
                _labCount == that._labCount &&
                _selfCount == that._selfCount &&
                Objects.equals(_name, that._name);
    }

    @Override
    public int hashCode() {
        return this._lectCount * this._lectCount;
    }
}
