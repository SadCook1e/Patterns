import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static final Map<String, Shape> shapes = new HashMap<>();
    public Shape getShape(String shapeName) {
        Shape shape = shapes.get(shapeName);
        if (shape == null) {
            switch (shapeName) {
                case "Circle":
                    shape = new Circle();
                    break;
                case "Point" :
                    shape = new Point();
                    break;
                case "Square":
                    shape = new Square();
                    break;
            }
            shapes.put(shapeName, shape);
        }
        return shape;
    }
}
