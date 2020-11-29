public class Binoculars extends Device {
    private double _zoom;
    public Binoculars(){
        super();
        this._zoom = 0.0;
    }
    public  Binoculars(String name,double height, double width, double weight,double zoom){
        super(name,height,width,weight);
        this._zoom = zoom;
    }
    public double get_zoom() {
        return _zoom;
    }

    public void set_zoom(double _zoom) {
        this._zoom = _zoom;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Максимальное приближение у этого бинокля: " + this._zoom);
    }
}
