public class Main {

    public  static void  main(String[] args){
        String type = "StarNet";
        INet loger = ConnectFactory.GetConnect(type);
        loger.Connect();

    }
}