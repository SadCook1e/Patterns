public class Point implements Shape{
    @Override
    public void draw(int x, int y) {
        System.out.println("POINT: \t\t\t x: " + x + "\ty: " + y);
    }
}
