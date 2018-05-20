package strategy.ducks;

import strategy.strategies.flying.FlyBehaviour;
import strategy.strategies.quacking.QuackBehaviour;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void display() {
        System.out.println("Displaying Rubber Duck.");
    }

}
