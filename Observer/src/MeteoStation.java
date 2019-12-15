import java.util.ArrayList;

public class MeteoStation implements Observed{
    private int temperature;
    private int pressure;
    private ArrayList<Observer> observers = new ArrayList<>();

    public void setValues(int temperature, int pressure) {
        this.pressure = pressure;
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        this.observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o: observers) {
            System.out.println("Data was changed!");
            o.handleEvent(temperature, pressure);
        }
    }
}
