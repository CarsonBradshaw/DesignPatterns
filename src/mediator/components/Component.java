package mediator.components;

import mediator.mediator.Mediator;

public interface Component {
    void emitEvent(Event event);
    void setMediator(Mediator mediator);
}
