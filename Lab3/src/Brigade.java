import java.util.Objects;
import java.util.Scanner;
public class Brigade implements IInterface{

    public static Scanner in = new Scanner(System.in);


    private String _date;
    private int _workersCount;
    private String _plan;
    private String _factOutput;

    public Brigade(){}
    public Brigade(String date, int workers, String plan, String out){
        this._date = date;
        this._workersCount = workers;
        this._plan = plan;
        this._factOutput = out;
    }
    @Override
    public void input() {
        System.out.print("Введите дату начала работ: ");
        this._date = in.next();
        System.out.print("Введите количество людей в бригаде: ");
        this._workersCount = in.nextInt();
        System.out.print("Введите план работ бригады: ");
        this._plan = in.nextLine();
        System.out.print("Введите фактическую выработку: ");
        this._factOutput = in.nextLine();
    }

    @Override
    public void output() {
        System.out.println("Дата начала работ: " + this._date);
        System.out.println("Количество людей в бригаде: " + this._workersCount);
        System.out.println("План работ бригады: " + this._plan);
        System.out.println("Фактическую выработку: " + this._factOutput);
        method(44);
    }

    @Override
    public void method(double d) {
        System.out.println("Ну, на днях закончат, наверное...");
    }

    @Override
    public String toString() {
        return("Дата начала работ: " + this._date + "\n"+
                "Количество людей в бригаде: " + this._workersCount + "\n" +
                "План работ бригады: " + this._plan +"\n" +
                "Фактическая выработка: " + this._factOutput + "\n");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brigade brigade = (Brigade) o;
        return _workersCount == brigade._workersCount &&
                Objects.equals(_date, brigade._date) &&
                Objects.equals(_plan, brigade._plan) &&
                Objects.equals(_factOutput, brigade._factOutput);
    }

    @Override
    public int hashCode() {
        return this._workersCount * this._workersCount;
    }
}
