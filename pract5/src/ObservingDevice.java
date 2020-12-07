public class ObservingDevice extends Device{
    private int _distance;

    public int get_distance() {
        return _distance;
    }

    public void set_distance(int _distance) {
        this._distance = _distance;
    }

    public ObservingDevice(){
        super();
        _distance = 0;
    }
    public ObservingDevice(String name,double height, double width, double weight, int distance){
        super(name,height,width,weight);
        _distance = distance;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Дальность обзора у прибора равна: " + _distance);
    }


}
