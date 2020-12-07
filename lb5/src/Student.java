import java.util.ArrayList;

public class Student extends Person {
    public String _grade;
    public ArrayList<Olympiad> olympiads;
    public String _unfavoriteLesson;

    public String get_unfavoriteLesson() {
        return _unfavoriteLesson;
    }

    public void set_unfavoriteLesson(String _unfavoriteLesson) {
        this._unfavoriteLesson = _unfavoriteLesson;
    }

    public String get_grade() {
        return _grade;
    }

    public void set_grade(String _grade) {
        this._grade = _grade;
    }

    public ArrayList<Olympiad> getOlympiads() {
        return olympiads;
    }
    public Student(){
        this._grade = "";
        this.olympiads = new ArrayList<>();
        this._unfavoriteLesson = "";
    }
    public Student(String surname,String name, String sex, String phoneNumber, String address,String form, ArrayList<Olympiad> ol,String unfavoriteLesson){
        super(surname, name, sex, phoneNumber, address);
        this._grade = form;
        this.olympiads = ol;
        this._unfavoriteLesson = unfavoriteLesson;
    }

    @Override
    public String ShowInfo() {
        StringBuilder sb = new StringBuilder(super.ShowInfo());
        sb.append("Класс ученика: ").append(this._grade).append("\n");
        sb.append("Олимпиады: \n");
        for (Olympiad ol: olympiads) {
            sb.append(ol._rang + " ").append(ol._lesson + " ").append(ol._place).append(" место\n");
        }
        sb.append("Нелюбимый урок: ").append(this._unfavoriteLesson).append("\n");
        return sb.toString();
    }
    public int winOlympiadsCount(){
        int count = 0;
        for(Olympiad ol : this.olympiads){
            if (ol._place <=3){count++;}
        }
        return count;
    }
    public void nextGrade(){
        int currGrade = Integer.parseInt(this._grade.split("-")[0]);
        currGrade++;
        this._grade = String.valueOf(currGrade + this._grade.split("-")[1]);
    }
    public void changeGrade(char g){
        String[] s = this._grade.split("-");
        s[1] = Character.toString(g);
    }
}
