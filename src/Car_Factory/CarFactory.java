package Car_Factory;

public class CarFactory {
    public Car getCar(String carType){
        if (carType==null){
            return null;
        }
        if (carType.equalsIgnoreCase("SUV")){
            return new SUV();
        }
        if (carType.equalsIgnoreCase("Sedan")){
            return new Sedan();
        }
        if (carType.equalsIgnoreCase("Mini")){
            return new Mini();
        }
        return null;
    }
}
