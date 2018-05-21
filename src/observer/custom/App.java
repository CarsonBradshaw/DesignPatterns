package observer.custom;

import observer.custom.observers.Observer;
import observer.custom.observers.WeatherDisplayer;
import observer.custom.subjects.Subject;
import observer.custom.subjects.WeatherData;

public class App {
    public static void main(String[] args) {
        Subject weatherProvider = new WeatherData();
        Observer observer1 = new WeatherDisplayer();
        Observer observer2 = new WeatherDisplayer();
        Observer observer3 = new WeatherDisplayer();

        weatherProvider.registerObserver(observer1);
        weatherProvider.registerObserver(observer2);
        weatherProvider.registerObserver(observer3);
        weatherProvider.notifyObservers();
    }
}
