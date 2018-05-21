package observer.builtin;

import observer.builtin.observers.WeatherDisplayer;
import observer.builtin.subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class App {
    public static void main(String[] args) {
        Observable observable = new WeatherData();
        Observer observer = new WeatherDisplayer();
        observable.addObserver(observer);
        ((WeatherData) observable).setChanged();
        observable.notifyObservers();
    }
}
