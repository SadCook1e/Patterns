public class Main {

    public  static void  main(String[] args){

        Composite composite = new Composite();
        composite.Add(new Circle());
        composite.Add(new Square());
        composite.Add(new Square());

        Composite shapes = new Composite();
        shapes.Add(new Circle());
        shapes.Add(new Square());
        shapes.Add(composite);

        shapes.draw();
    }
}