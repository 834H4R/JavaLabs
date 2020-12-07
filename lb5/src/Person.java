public class Person {
    public String _surname;
    public String _name;
    public String _sex;
    public String _phoneNumber;
    public String _address;

    public Person(){
        this._surname = "";
        this._name = "";
        this._sex = "";
        this._phoneNumber = "";
        this._address = "";
    }
    public Person(String surname,String name, String sex, String phoneNumber, String address){
        this._surname = surname;
        this._name = name;
        this._sex = sex;
        this._phoneNumber = phoneNumber;
        this._address = address;
    }
    public String get_surname() {
        return _surname;
    }

    public void set_surname(String _surname) {
        this._surname = _surname;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public String get_sex() {
        return _sex;
    }

    public void set_sex(String _sex) {
        this._sex = _sex;
    }

    public String get_phoneNumber() {
        return _phoneNumber;
    }

    public void set_phoneNumber(String _phoneNumber) {
        this._phoneNumber = _phoneNumber;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }
    public String getStreet(){
        int startInd = this._address.indexOf("вулиця") + "вулиця ".length();
        int endInd = this._address.indexOf(' ',startInd);
        return (this._address.substring(startInd,endInd));
    }
    public boolean isLiveInApartment(){
        return (this._address.contains("квартира"));
    }
    public String ShowInfo(){
        return ("Ім'я : " + this._name + "\n" +
                "Прізвище: " + this._surname + "\n" +
                "Стать: " + this._sex + "\n" +
                "Номер телефону: " + this._phoneNumber + "\n" +
                "Адреса: " + this._address + "\n");
    }
    public String[] toArray(){
        return new String[]{this._surname,this._name,this._sex,this._phoneNumber,this._address};
    }

}
