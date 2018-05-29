package memento;

import memento.originator.Originator;

import java.util.ArrayList;
import java.util.List;

public class Mediator {
    public static void main(String[] args) {
        List<Originator.Memento> list = new ArrayList<>();
        Originator originator = new Originator();
        originator.setValue("0");
        list.add(originator.saveToMemento());
        originator.setValue("1");
        originator.setValue("2");
        list.add(originator.saveToMemento());
        originator.restoreFromMemento(list.get(list.size()-1));
        originator.restoreFromMemento(list.get(list.size()-2));
    }
}
