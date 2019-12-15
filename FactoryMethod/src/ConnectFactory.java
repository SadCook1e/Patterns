public class ConnectFactory {
    public static INet GetConnect(String str){
        switch (str){
            case "EarthNet":
                return new EarthNet();
            case "StarNet":
                return  new StarNet();
            default:
                return new EarthNet();
        }
    }
}