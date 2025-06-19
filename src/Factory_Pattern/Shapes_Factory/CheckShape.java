package Factory_Pattern.Shapes_Factory;

public class CheckShape {
    public static void main(String[] args) {
        ShapeFactory factory=new ShapeFactory();
        Shape circle= factory.getShape("Circle");
        Shape triangle=factory.getShape("Triangle");
        Shape square=factory.getShape("Square");
        circle.draw();
        triangle.draw();
        square.draw();
    }
}
