public class Main {

    public  static void  main(String[] args){
        Prototipe prototype = new Prototipe();
        Prototipe clone = prototype.copy();
        clone.setType(Prototipe.Type.TWO);
        clone.print();
    }
}