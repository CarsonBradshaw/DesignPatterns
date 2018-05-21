package observer.builtin.observers;

import observer.builtin.subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class WeatherDisplayer implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData)
            System.out.println("WeatherDisplayer has been updated.");
    }
}
