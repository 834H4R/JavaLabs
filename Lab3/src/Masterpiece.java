import java.lang.reflect.Constructor;
import java.util.Objects;
import java.util.Scanner;

public class Masterpiece implements IInterface {

    public static Scanner in = new Scanner(System.in);

    private String _type;
    private String _name;
    private String _author;
    private int _year;
    public Masterpiece(){}
    public Masterpiece(String type, String name, String author, int year){
       this._type = type;
       this._name = name;
       this._author = author;
       this._year = year;
    }

    @Override
    public void input() {
        System.out.print("Введите тип произведения искусства: ");
        this._type = in.nextLine();
        System.out.print("Введите название произведения искусства: ");
        this._name =  in.nextLine();
        System.out.print("Введите автора произведения искусства: ");
        this._author =  in.nextLine();
        System.out.print("Введите год создания произведения искусства: ");
        this._year = in.nextInt();
    }

    @Override
    public void output() {
        System.out.print(this.toString());
        method(2020);
    }

    @Override
    public void method(double d) {
        int diff = (int)d - this._year;
        System.out.println("Этому произведению искусства " + diff + " лет");
    }

    @Override
    public String toString() {
        return ("Тип произвидения искусства: " + this._type + "\n" +
                "Название произведения искусства: " + this._name + "\n" +
                "Автор произведения искусства: " + this._author + "\n" +
                "Год создания произвидения искусства: " + this._year + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Masterpiece that = (Masterpiece) o;
        return _year == that._year &&
                Objects.equals(_type, that._type) &&
                Objects.equals(_name, that._name) &&
                Objects.equals(_author, that._author);
    }

    @Override
    public int hashCode() {
        return this._year * this._year;
    }
}
