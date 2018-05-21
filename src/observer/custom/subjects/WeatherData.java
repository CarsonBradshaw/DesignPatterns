package observer.custom.subjects;

import observer.custom.observers.Observer;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements observer.custom.subjects.Subject {

    private Set<Observer> observers = new HashSet<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(Observer::update);
    }
}
