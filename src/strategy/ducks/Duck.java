package strategy.ducks;

import strategy.strategies.flying.FlyBehaviour;
import strategy.strategies.quacking.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void swim(){
        System.out.println("All ducks swim. Therefore, I am swimming.");
    }

}
