package Factory_Pattern.Shapes_Factory;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType==null) return null;
        if (shapeType.equalsIgnoreCase("Circle")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("Triangle")){
            return new Triangle();
        }
        if (shapeType.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
