import java.util.ArrayList;

public class Olympiad {
    public String _rang;
    public String _lesson;
    public int _place;

    public Olympiad(){
        this._rang = "";
        this._lesson = "";
        this._place = 0;
    }
    public  Olympiad(String in){
        if(in.length() > 1 ){
            String[] splited = in.split(", ");
            this._rang = splited[0];
            this._lesson = splited[1];
            this._place = Integer.parseInt(splited[2]);
        }
        else{this._rang = "";this._lesson="";this._place=0;}
    }

    @Override
    public String toString() {
        return "Олімпіада{" +
                "Тип ='" + _rang + '\'' +
                ", Предмет='" + _lesson + '\'' +
                ", Місце" + _place +
                '}';
    }

    public Olympiad(String rang, String lesson, int place){
        this._rang = rang;
        this._lesson = lesson;
        this._place = place;
    }
    public String getLesson() {
        return _lesson;
    }

    public int getPlace() {
        return _place;
    }

    public String getRang() {
        return _rang;
    }

    public void setLesson(String lesson) {
        this._lesson = lesson;
    }

    public void setPlace(int place) {
        this._place = place;
    }

    public void setRang(String rang) {
        this._rang = rang;
    }
    public static ArrayList<Olympiad> GetOlympiads(String in){
        ArrayList<Olympiad> list = new ArrayList<>();
        String[] olymp = in.split(";");
        for (String ol:olymp) {
            list.add(new Olympiad(ol));
        }
        return list;
    }

}
