public class Main {

    public  static void  main(String[] args){
        Radio r = new Radio();
        Station st = new RadioRock();
        r.setStation(st);
        r.play();
        r.nextStation();
        r.play();

    }
}