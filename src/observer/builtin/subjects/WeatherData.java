package observer.builtin.subjects;

import java.util.Observable;

public class WeatherData extends Observable {
    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
