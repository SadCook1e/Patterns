import javax.swing.plaf.synth.SynthStyleFactory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("I'm a circle");
    }
}
