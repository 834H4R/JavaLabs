public class Device {
    private String _name;
    private double _height;
    private double _width;
    private double _weight;

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Device(){
        this._height = 0.0;
        this._weight = 0.0;
        this._width = 0.0;
        this._name = "";
    }
    public Device(String name,double height, double width, double weight){
        this._height = height;
        this._weight = weight;
        this._width = width;
        this._name = name;
    }

    public double getHeight() {
        return _height;
    }

    public void setHeight(double height) {
        this._height = height;
    }

    public double getWidth() {
        return _width;
    }

    public void setWidth(double width) {
        this._width = width;
    }

    public double getWeight() {
        return _weight;
    }

    public void setWeight(double weight) {
        this._weight = weight;
    }
    public double getVolume(){
        return this._height * this._width * 2; // сделаем допущение что приспособление - квадратное у основания
    }
    public void Output()
    {
       System.out.println("Этот прибор называется " + this._name + " его размеры таковы:\nВысота " + this._height +
               "\n Ширина: " + this._width + "\nОн весит " + this._weight + "\n Его объем " + this.getVolume());
    }
}
