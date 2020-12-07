public class Teacher extends Person{
    public String _lesson;
    public String _category;
    public double _salary;
    public String[] _awards;

    public Teacher(){
        super();
        this._lesson = "";
        this._category = "";
        this._salary = 0;
        this._awards = new String[0];
    }
    public Teacher(String surname,String name, String sex, String phoneNumber, String address,String lesson, String category, double salary,String[] awards){
        super(surname, name, sex, phoneNumber, address);
        this._lesson = lesson;
        this._category = category;
        this._salary = salary;
        this._awards = awards;
    }

    public String get_lesson() {
        return _lesson;
    }

    public void set_lesson(String _lesson) {
        this._lesson = _lesson;
    }

    public String get_category() {
        return _category;
    }

    public void set_category(String _category) {
        this._category = _category;
    }

    public double get_salary() {
        return _salary;
    }

    public void set_salary(double _salary) {
        this._salary = _salary;
    }

    public String[] get_awards() {
        return _awards;
    }

    public void set_awards(String[] _awards) {
        this._awards = _awards;
    }

    @Override
    public String ShowInfo() {
        StringBuilder sb = new StringBuilder(super.ShowInfo() +
                "Предмет: " + this._lesson + "\n" +
                "Категория: " + this._category + "\n" +
                "Оклад: " + this._salary + "\n" +
                "Награды: ");
        for(int i =0;i<this._awards.length;i++){
            sb.append(this._awards[i]).append(" ");
        }
        sb.append("\n");
        return sb.toString();
    }
    public void increaseSalary(double percent){
        if(percent > 0 ){
            this._salary += this._salary*percent;
        }
    }
    public void increaseCategory(){
        if(this._category.equals("перша")){this._category = "друга";}
        else if(this._category.equals("друга")){this._category = "вища";}
    }
    public int countOfAwards(){
       return (this._awards.length);
    }
    public String shortInfo(){
        String out = this._surname + " " + this._name.charAt(0) + " - ";
        if(this._sex.equals("Чоловіча")){out += " " + "вчитель предмету" + this._lesson;}
        else if(this._sex.equals("Жіноча")){out += " " + "вчителька предмету" + this._lesson;}
        return out;
    }
    public String awardsToStr(){
        StringBuilder sb = new StringBuilder();
        for (String award: _awards) {
            sb.append(award).append(", ");
        }
        return sb.toString();
    }


}
