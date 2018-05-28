package mediator;

import mediator.components.*;
import mediator.mediator.Mediator;

import java.util.Random;

public class App {
    public static void main(String[] args) {

        Alarm alarm = new Alarm();
        CoffeePot coffeePot = new CoffeePot();
        Calendar calendar = new Calendar();


        Mediator mediator = new Mediator(alarm, coffeePot, calendar);

        alarm.setMediator(mediator);
        coffeePot.setMediator(mediator);
        calendar.setMediator(mediator);

        Thread alarmRunnable = new Thread(() -> emitEventRepeatedly(Event.ALARM_EVENT, alarm));
        Thread coffePotRunnable = new Thread(() -> emitEventRepeatedly(Event.WEEKEND, coffeePot));
        Thread calendarRunnable = new Thread(() -> emitEventRepeatedly(Event.TRASH_DAY, calendar));

        alarmRunnable.start();
        coffePotRunnable.start();
        calendarRunnable.start();

    }

    private static void emitEventRepeatedly(Event event, Component component) {
        Random random = new Random();
        while(true){
            int delay = random.nextInt(4000);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            component.emitEvent(event);
        }
    }
}
