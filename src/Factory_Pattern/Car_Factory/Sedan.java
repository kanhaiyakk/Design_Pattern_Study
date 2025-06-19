package Factory_Pattern.Car_Factory;

public class Sedan implements Car {
    @Override
    public void assemble(){
        System.out.println("Sedan -- assemble");
    }
}
