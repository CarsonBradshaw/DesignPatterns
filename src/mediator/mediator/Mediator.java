package mediator.mediator;

import mediator.components.Alarm;
import mediator.components.Calendar;
import mediator.components.CoffeePot;
import mediator.components.Event;

public class Mediator {

    private Alarm alarm;
    private CoffeePot coffeePot;
    private Calendar calendar;

    public Mediator(Alarm alarm, CoffeePot coffeePot, Calendar calendar) {
        this.alarm = alarm;
        this.coffeePot = coffeePot;
        this.calendar = calendar;
    }

    public void onEvent(Event event){
        System.out.println("Received " + event);
        if(event == Event.ALARM_EVENT){
            System.out.println("Alarm rang. Dispatching to coffeePot to start brewing.");
        }else if(event == Event.WEEKEND){
            System.out.println("It's the weekend. Letting the coffePot take a break and hitting snooze way too many times.");
        }else if(event == Event.TRASH_DAY){
            System.out.println("Time to take out the trash. Oh, butler!!!");
        }
    }
}
