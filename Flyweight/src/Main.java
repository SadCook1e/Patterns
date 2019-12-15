import java.util.ArrayList;
import java.util.Random;

public class Main {

    public  static void  main(String[] args){

        ShapeFactory factory = new ShapeFactory();
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(factory.getShape("Circle"));
        shapes.add(factory.getShape("Square"));
        shapes.add(factory.getShape("Point"));
        shapes.add(factory.getShape("Square"));

        Random rand = new Random();
        for (Shape shape : shapes) {
            int x = rand.nextInt(100);
            int y = rand.nextInt(100);
            shape.draw(x, y);
        }
    }
}