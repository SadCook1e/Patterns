public class Singleton {
    private static Singleton _instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
    public void print() {
        System.out.println("SetUp");
    }
}