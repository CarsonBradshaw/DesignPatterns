package strategy;

import strategy.ducks.Duck;
import strategy.ducks.MallardDuck;
import strategy.ducks.ModelDuck;
import strategy.ducks.RubberDuck;
import strategy.strategies.flying.FlyNoWings;
import strategy.strategies.flying.FlyWithWings;
import strategy.strategies.quacking.MuteQuack;
import strategy.strategies.quacking.Quack;
import strategy.strategies.quacking.Squeak;

public class App {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck(new FlyWithWings(), new Quack());
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        System.out.println();

        Duck modelDuck = new ModelDuck(new FlyNoWings(), new MuteQuack());
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        System.out.println();

        Duck rubberDuck = new RubberDuck(new FlyNoWings(), new Squeak());
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
