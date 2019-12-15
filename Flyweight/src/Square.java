public class Square implements Shape{
    private int a = 1;


    @Override
    public void draw(int x, int y) {
        System.out.println("SQUARE: \t\t x: " + x + "\ty: " + y + "\ta: " + a);
    }
}
