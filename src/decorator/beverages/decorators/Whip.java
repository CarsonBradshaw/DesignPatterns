package decorator.beverages.decorators;

import decorator.beverages.Beverage;

public class Whip extends BeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return .25 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return "Whip " + beverage.getDescription();
    }
}
