package strategy.ducks;

import strategy.strategies.flying.FlyBehaviour;
import strategy.strategies.quacking.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour){
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    @Override
    public void display() {
        System.out.println("Displaying Mallard Duck");
    }

}
