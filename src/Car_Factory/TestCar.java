package Car_Factory;

public class TestCar {
    public static void main(String[] args) {
        CarFactory carFactory=new CarFactory();
        Car suvCar=carFactory.getCar("SUV");
        Car sedanCar=carFactory.getCar("Sedan");
        Car miniCar=carFactory.getCar("Mini");
        suvCar.assemble();
        sedanCar.assemble();
        miniCar.assemble();
    }
}
