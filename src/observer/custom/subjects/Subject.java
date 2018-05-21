package observer.custom.subjects;

import observer.custom.observers.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
