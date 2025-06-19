package Factory_Pattern.Car_Factory;

public class SUV implements Car {
    @Override
    public void assemble() {
        System.out.println("SUV -- assemble");
    }
}
