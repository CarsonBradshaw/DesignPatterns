package facade;

import facade.components.Amplifier;
import facade.components.DvdPlayer;
import facade.components.Screen;
import facade.components.TheaterLights;
import facade.facade.ConcreteHomeTheaterFacade;
import facade.facade.HomeTheaterFacade;

public class App {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();

        HomeTheaterFacade homeTheaterFacade = new ConcreteHomeTheaterFacade(amplifier, dvdPlayer, screen, theaterLights);

        homeTheaterFacade.watchMovie();
        System.out.println();
        homeTheaterFacade.endMovie();
    }
}
