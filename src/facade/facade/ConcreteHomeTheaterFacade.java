package facade.facade;


import facade.components.Amplifier;
import facade.components.DvdPlayer;
import facade.components.Screen;
import facade.components.TheaterLights;

public class ConcreteHomeTheaterFacade implements HomeTheaterFacade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Screen screen;
    private TheaterLights theaterLights;

    public ConcreteHomeTheaterFacade(Amplifier amplifier, DvdPlayer dvdPlayer, Screen screen, TheaterLights theaterLights){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.screen = screen;
        this.theaterLights = theaterLights;
    }

    @Override
    public void watchMovie() {
        System.out.println("Prepping theater to watch movie...");
        amplifier.on();
        dvdPlayer.on();
        screen.on();
        theaterLights.off();
    }

    @Override
    public void endMovie() {
        System.out.println("Shutting down your theater...");
        amplifier.off();
        dvdPlayer.off();
        screen.off();
        theaterLights.on();
    }
}
