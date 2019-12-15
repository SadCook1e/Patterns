public class ConsoleObserver implements Observer {
    @Override
    public void handleEvent(int temp, int pressure) {
        System.out.println("Temp: " + temp + "\t Pressure: " + pressure);
    }
}
