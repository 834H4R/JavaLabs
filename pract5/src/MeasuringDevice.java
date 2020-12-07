public class MeasuringDevice extends Device {
    private double _scaleStep;
    private double _maxValue;
    private String _valueType;

    public double get_maxValue() {
        return _maxValue;
    }

    public void set_maxValue(double _maxValue) {
        this._maxValue = _maxValue;
    }

    public MeasuringDevice(){
        super();
        _scaleStep = 0.0;
        _valueType = "";
    }
    public MeasuringDevice(String name,double height, double width, double weight,double scaleStep,double maxValue, String valueType){
        super(name,height, width, weight);
        this._scaleStep = scaleStep;
        this._valueType = valueType;
        this._maxValue = maxValue;
    }
    public double get_scaleStep() {
        return _scaleStep;
    }

    public void set_scaleStep(double _scaleStep) {
        this._scaleStep = _scaleStep;
    }

    public String get_valueType() {
        return _valueType;
    }

    public void set_valueType(String _valueType) {
        this._valueType = _valueType;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("У него шаг шкалы равен" + this._scaleStep + " Максимальное значение - " + this._maxValue +
                " А измеряет он " + _valueType);
        System.out.println("Общее количество делений на шкале "+this.countOfDivides());
    }
    public int countOfDivides(){ // возвращает количество делений на шкале
        return (int) (this._maxValue / this._scaleStep);
    }
}
