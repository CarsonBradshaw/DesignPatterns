package mediator.components;

import mediator.mediator.Mediator;

import java.util.Random;

public class CoffeePot implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void emitEvent(Event event) {
        mediator.onEvent(event);
    }
}
