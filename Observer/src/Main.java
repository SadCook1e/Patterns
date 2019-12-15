public class Main {

    public  static void  main(String[] args){

        MeteoStation m = new MeteoStation();
        m.addObserver(new ConsoleObserver());
        m.setValues(10, 140);
        m.setValues(140, 180);
        m.notifyObservers();


    }
}