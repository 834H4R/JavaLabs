public class Main {

    public static void main(String[] args) {
        Device[] devices = {
                new Device(),
                new Device("Стетоскоп",0.20,0.10,0.100),
                new MeasuringDevice(),
                new MeasuringDevice("Амперметр",0.20,0.20,0.100,0.1,30,"Амперы"),
                new ObservingDevice(),
                new ObservingDevice("Камера наблюдения",0.15,0.20,2,30),
                new Binoculars(),
                new Binoculars("Бинокль",0.20,0.10,0.500,5)};
        for (Device device : devices) {
            device.Output();
            if(device instanceof Device)
            System.out.println("===============");
        }

    }
}
