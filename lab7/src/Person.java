import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {
    private String _surname;
    private String _name;
    private Calendar _birthDate;
    private double _height;
    private double _weight;

    Person(String surname, String name, int year, int month, int day, double height, double weight){
        this._surname = surname;
        this._name = name;
        this._birthDate = new GregorianCalendar(year,month,day);
        this._height = height;
        this._weight = weight;
    }
    Person(String surname,String name, String birthDate, double height, double weight){
        this._surname = surname;
        this._name = name;
        this.SetBirthdayWithString(birthDate);
        this._height = height;
        this._weight = weight;
    }
    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public String get_surname() {
        return _surname;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }
    public void SetBirthdayWithString(String s ){
        String[] splited = s.split(".");
        Calendar c = new GregorianCalendar(Integer.parseInt(splited[0]),Integer.parseInt(splited[1]),
                Integer.parseInt(splited[2]));
        this._birthDate = c;
    }
    public Calendar get_birthDate() {
        return _birthDate;
    }
    public String birthDateToString(){
        String out = "";
        out+= this._birthDate.get(Calendar.YEAR) + "." + this._birthDate.get(Calendar.DAY_OF_MONTH) + "." +
                this._birthDate.get(Calendar.MONTH);
        return out;
    }
    public void set_birthDate(int day, int month, int year) {
        this._birthDate = new GregorianCalendar(year,day,month);
    }

    public double get_height() {
        return _height;
    }

    public void set_height(double _height) {
        this._height = _height;
    }

    public double get_weight() {
        return _weight;
    }

    public void set_weight(double _weight) {
        this._weight = _weight;
    }
    public int FullYears(Calendar a)
    {
        Calendar b = this._birthDate;
        if(a.after(b))
        {
            int diff = b.get(Calendar.YEAR) - a.get(Calendar.YEAR);
            if (a.get(Calendar.MONTH) > b.get(Calendar.MONTH) ||
                    (a.get(Calendar.MONTH) == b.get(Calendar.MONTH) && a.get(Calendar.DATE) > b.get(Calendar.DATE))) {
                diff--;
            }
            return  Math.abs(diff);
        }
        else
        {
            System.out.print("Не правильная дата");
            return  0;
        }
    }

}
