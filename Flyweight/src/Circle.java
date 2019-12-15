public class Circle implements  Shape {
    private int r = 1;


    @Override
    public void draw(int x, int y) {
        System.out.println("CIRCLE: \t\t x: " + x + "\ty: " + y + "\tr: " + r);
    }
}
