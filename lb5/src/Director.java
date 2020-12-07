public class Director extends Teacher{
    public String _position;

    public Director(){
        super();
        this._position = "";

    }
    public Director(String surname,String name, String sex, String phoneNumber, String address,String lesson, String category, double salary,String[] awards,String position){
        super(surname, name, sex, phoneNumber, address, lesson, category, salary, awards);
        this._position = position;
    }

    public String get_position() {
        return _position;
    }

    public void set_position(String _position) {
        this._position = _position;
    }


    @Override
    public String ShowInfo() {
        StringBuilder sb = new StringBuilder(super.shortInfo());
        sb.append("Должность: ").append(this._position);
        return sb.toString();
    }

    @Override
    public String shortInfo() {
        String out = this._surname + " " + this._name.charAt(0) + " - " + this._position + " ";
        if(this._sex.equals("Чоловіча")){out += " " +"вчитель предмету" + this._lesson;}
        else if(this._sex.equals("Жіноча")){out += " " + "вчителька предмету" + this._lesson;}
        return out;
    }
}
