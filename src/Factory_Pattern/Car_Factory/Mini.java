package Factory_Pattern.Car_Factory;

public class Mini implements Car {
    @Override
    public void assemble() {
        System.out.println("Mini -- assemble");
    }
}
