package mediator.components;

import mediator.mediator.Mediator;

import java.util.Random;

public class Alarm implements Component {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void snooze(){
        System.out.println("snoozing");
    }

    public void setAlarm(int time){
        System.out.println("alarm has been set to " + time);
    }

    @Override
    public void emitEvent(Event event) {
        mediator.onEvent(event);
    }
}
