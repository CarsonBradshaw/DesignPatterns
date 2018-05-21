package observer.custom.observers;

public class WeatherDisplayer implements observer.custom.observers.Observer {
    @Override
    public void update() {
        System.out.println("Observer " + hashCode() + " has been notified.");
    }
}
