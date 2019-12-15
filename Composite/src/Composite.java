import java.util.ArrayList;

public class Composite implements Shape {
    ArrayList<Shape> composites = new ArrayList<>();
    public void Add(Shape shape) {
        this.composites.add(shape);
    }
    public void Remove(Shape shape) {
        this.composites.remove(shape);
    }

    @Override
    public void draw() {
        for(int i = 0; i < composites.size(); i++) {
            composites.get(i).draw();
        }
    }
}
